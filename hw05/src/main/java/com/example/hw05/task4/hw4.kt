package com.example.hw05.task4

data class Config(var host: String = "", var port: Int = 0, var debug: Boolean = false)

fun main() {
    // 1. Rewrite using apply
    val config = Config().apply {
        host = "localhost"
        port = 8080
        debug = true
    }
    println(config)

    // 2. Safe print uppercase using let
    val name: String? = "Rina"
    name?.let { println(it.uppercase()) }

    // 3. Logging list changes using also
    val numbers = mutableListOf(1, 2, 3)
    numbers
        .also { println("Before: $it") }
        .add(4)
        .also { println("After: $numbers") }
}