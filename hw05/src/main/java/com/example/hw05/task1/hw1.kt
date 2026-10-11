package com.example.hw05.task1

fun main() {
    // 1. Double an Int
    val doubleIt: (Int) -> Int = { it * 2 }
    println(doubleIt(7))

    // 2. Check if starts with vowel
    val startsWithVowel: (String) -> Boolean = { word ->
        word.lowercase().firstOrNull() in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Max of two Ints
    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
}