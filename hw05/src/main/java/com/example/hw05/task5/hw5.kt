package com.example.hw05.task5

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    // 1. Partition passing & failing
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    // 2. Max & Min scorer with let
    students.maxByOrNull { it.score }?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }?.let { println("Low scorer : ${it.name} (${it.score})") }

    // 3. Class average using fold
    val total = students.fold(0) { acc, student -> acc + student.score }
    val avg = total.toDouble() / students.size
    println("Class average: String.format(\"%.1f\", avg)")

    // 4. Formatted summary using buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { s ->
            val status = if (s.score >= 70) "PASS" else "FAIL"
            appendLine(String.format("%-8s %-3d %s", s.name, s.score, status))
        }
    }
    print(report)
}