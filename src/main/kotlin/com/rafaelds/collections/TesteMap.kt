package com.rafaelds.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Rafael", 950.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave $k, Valor $v") }

    val map2 = mapOf(
        "Wesley" to 610.0,
        "Tiago" to 142.0
    )

    map2.forEach { (k, v) -> println("Chave $k Valor $v") }
}