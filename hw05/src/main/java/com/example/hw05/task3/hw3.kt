package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    // 1. Filter score >= 70
    val passedCount = students.filter { it.score >= 70 }.size

    // 2. Map to "Name (Score)"
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    // 3. Sorted by score descending (Top 3)
    val top3Names = students.sortedByDescending { it.score }.take(3).map { it.name }

    // 4. Fold total & average
    val totalScore = students.fold(0) { acc, s -> acc + s.score }
    val averageScore = totalScore.toDouble() / students.size
    println("Total: $totalScore   Average: $averageScore")

    // 5. Group by year
    val groupedByYear = students.groupBy { it.year }
    groupedByYear.forEach { (year, list) ->
        println("$year: ${list.map { it.name }}")
    }
}