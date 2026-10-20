// task1/hw1.kt
package task1

data class Book(val isbn: String, val title: String, val year: Int)

fun main() {
    // 1. Buat dua instance Book
    val book1 = Book("978-123", "Kotlin in Action", 2024)
    val book2 = Book("978-456", "Android Basics", 2023)

    // 2. Print keduanya (menguji toString otomatis)
    println(book1)
    println(book2)

    // 3. Gunakan copy() untuk membuat buku ketiga dengan tahun yang diubah
    val book3 = book1.copy(year = 2026)
    println(book3)

    // 4. Cek apakah book1 dan book2 sama menggunakan ==
    println(book1 == book2)
}