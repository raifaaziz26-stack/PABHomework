package com.example.hw03.task3

fun main() {
    var studentName: String? = null

    // Skenario 1: studentName = null
    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let { println("Hello, $it!") }

    println() // Baris pemisah

    // Skenario 2: studentName = "Ayu"
    studentName = "Ayu"
    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let { println("Hello, $it!") }
}