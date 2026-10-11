package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.forEach { item ->
        if (condition(item)) {
            println(item)
        }
    }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    val result = mutableListOf<String>()
    list.forEach { result.add(mapper(it)) }
    return result
}

fun main() {
    // 1. Test applyTwice
    val doubleIt: (Int) -> Int = { it * 2 }
    println(applyTwice(3, doubleIt))

    // 2. Test printIf
    val courses = listOf("Algorithm", "English", "Android", "OS", "UX Design")
    val startsWithVowel: (String) -> Boolean = { word ->
        word.lowercase().firstOrNull() in listOf('a', 'e', 'i', 'o', 'u')
    }
    printIf(courses, startsWithVowel)

    // 3. Test transform
    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}