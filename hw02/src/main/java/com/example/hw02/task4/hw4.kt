package com.example.hw02.task4

// Part A
fun calculateStudyMinutes(sessions: Int, minutesPerSession: Int): Int {
    return sessions * minutesPerSession
}

// Part B
fun calculateTotalCredits(courses: Int, creditsPerCourse: Int): Int {
    return courses * creditsPerCourse
}

fun main() {
    // Part A Calls
    val total1 = calculateStudyMinutes(3, 25)
    println("Total study time: $total1 minutes")

    val total2 = calculateStudyMinutes(4, 30)
    println("Total study time: $total2 minutes")

    // Part B Loop
    for (course in 1..5) {
        val credits = calculateTotalCredits(course, 3)
        println("Courses: $course, total credits: $credits")
    }
}