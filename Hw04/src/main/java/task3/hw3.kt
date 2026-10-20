// task3/hw3.kt
package task3

// 1. Extension untuk menghitung kata dalam String
fun String.wordCount(): Int {
    return this.trim().split("\\s+".toRegex()).count { it.isNotEmpty() }
}

// 2. Extension untuk memformat Int menjadi Rupiah
fun Int.toRupiahString(): String {
    val reversedStr = this.toString().reversed()
    val formattedStr = reversedStr.chunked(3).joinToString(".").reversed()
    return "Rp $formattedStr"
}

// 3. Extension untuk menghitung rata-rata nilai dalam rentang tertentu
fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = this.filter { it in min..max }
    if (filtered.isEmpty()) return 0.0
    return filtered.average()
}

fun main() {
    println("Halo dunia Kotlin".wordCount())

    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    val numbers = listOf(10, 50, 200, 85, -5)
    println("clampedAverage(0, 100) = ${numbers.clampedAverage(0, 100)}")
}