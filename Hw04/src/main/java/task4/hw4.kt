// task4/hw4.kt
package task4

fun main() {
    // 1. MutableList
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF101")
    println("Courses List: $courses")

    // 2. Konversi ke Set untuk menghapus duplikat
    val uniqueCourses = courses.toSet()
    println("Unique Courses: $uniqueCourses")

    // 3. Map (SKS)
    val creditMap = mapOf("SIF101" to 3, "SIF202" to 4, "SIF303" to 3, "SIF404" to 2, "SIF505" to 3)
    println("Credits for SIF202: ${creditMap.getOrDefault("SIF202", 0)}")
    println("Credits for SIF999 (Not Found): ${creditMap.getOrDefault("SIF999", 0)}")

    // 4. Summary
    val totalCourses = uniqueCourses.size
    val totalCredits = uniqueCourses.sumOf { creditMap.getOrDefault(it, 0) }
    println("Total Enrolled Courses: $totalCourses")
    println("Total Credit Hours: $totalCredits")
}