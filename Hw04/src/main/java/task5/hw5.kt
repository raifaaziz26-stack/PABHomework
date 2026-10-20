// task5/hw5.kt
package task5

// 1. Enum class
enum class LetterGrade { A, B, C, D, E }

// 2. Data class
data class Student(val id: Int, val name: String, val score: Int)

// 3. Extension function
fun Student.letterGrade(): LetterGrade {
    return when {
        score >= 85 -> LetterGrade.A
        score >= 70 -> LetterGrade.B
        score >= 55 -> LetterGrade.C
        score >= 40 -> LetterGrade.D
        else -> LetterGrade.E
    }
}

fun main() {
    // 4. MutableList students
    val students = mutableListOf(
        Student(101, "Ali", 88),
        Student(102, "Budi", 65),
        Student(103, "Citra", 92),
        Student(104, "Dewi", 71)
    )

    // Tambah satu student
    students.add(Student(105, "Eko", 35))

    // Hapus student dengan score di bawah 40
    students.removeAll { it.score < 40 }

    // 5. Destructuring dan Print
    for (student in students) {
        val (id, name, score) = student
        val grade = student.letterGrade()

        // Menggunakan padEnd untuk merapikan spasi (seperti di expected output)
        println("$id - ${name.padEnd(8)} - $score -> $grade")
    }
}