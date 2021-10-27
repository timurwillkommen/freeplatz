package com.example.freeplatz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.freeplatz.model.Screen
import com.example.freeplatz.presentation.CreateTaskScreen
import com.example.freeplatz.presentation.MainScreen
import com.example.freeplatz.presentation.MyProfileScreen
import com.example.freeplatz.ui.theme.FreeplatzTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FreeplatzTheme {
                Surface(color = MaterialTheme.colors.background) {
                    MyNavigation()
                }
            }
        }
    }
}

@Composable
fun MyNavigation() {
    val items = listOf(
        Screen.MainScreen,
        Screen.MyProfileScreen
    )
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.forEach { screen ->
                    BottomNavigationItem(
                        unselectedContentColor = Color(0xFFE1E1E1),
                        icon = { },
                        label = { Text(stringResource(screen.resourceId), fontSize = 14.sp) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                // Pop up to the start destination of the graph to
                                // avoid building up a large stack of destinations
                                // on the back stack as users select items
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                // Avoid multiple copies of the same destination when
                                // reselecting the same item
                                launchSingleTop = true
                                // Restore state when reselecting a previously selected item
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController,
            startDestination = Screen.MainScreen.route,
            Modifier.padding(innerPadding)
        ) {
            composable(Screen.MainScreen.route) { MainScreen(navController) }
            composable(Screen.MyProfileScreen.route) { MyProfileScreen(navController) }
            composable(Screen.CreateTaskScreen.route) { CreateTaskScreen(navController) }
        }
    }
}
