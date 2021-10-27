package com.example.freeplatz.repository

import com.example.freeplatz.model.Task

class TaskRepository {

    fun getAllData(): List<Task> {
        return listOf(
            Task(
                header = "Программа на С++",
                priceValue = 140,
                task = "Напишите код, который переводит целое число в строку, при том что его можно применить в любой системе счисления.",
                date = "28.10.2021"
            ),
            Task(
                header = "Доработка и запуск сайта. Laravel + React",
                priceValue = 500,
                task = "Необходима команда специалистов либо сильный фулл стак программист, для исправления багов на незаконченном проекте. Обязателен опыт в React + Next.JS (используется для SSR) + Laravel + Docker",
                date = "30.11.2021"
            ),

            Task(
                header = "Требуется создать приложение на NodeJS",
                priceValue = 2000,
                task = "Требуется создать приложение на NodeJS, оно будет автоматически обновлять цены на оборудование каждый день в заданное время.",
                date = "28.10.2022"
            ),

            Task(
                header = "React Native accelerometer",
                priceValue = 1230,
                task = "Добрый день! нужен код который на основе данных с акселерометра (сенсоров) определяет",
                date = "28.10.2021"
            ),

            Task(
                header = "Переделать Python скрипт для Ubuntu",
                priceValue = 1400,
                task = "Нужно сделать скрип Для UBUNTU который выгружает в файл из хеша биткоин транзакции, значения R,S и публичного ключа.",
                date = "28.10.2021"
            ),

            Task(
                header = "Проектирование системы",
                priceValue = 50000,
                task = "Разработать backend десктоп системы (python/django)",
                date = "31.10.2022"
            )


        )
    }
}