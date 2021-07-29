package com.rafaelds.collections

fun main() {
    val salaries = DoubleArray(3)
    val remuneracao = doubleArrayOf(1500.0, 2500.0, 3500.0, 4500.0, 8500.0, 9500.0)

    salaries[0] = 2000.0
    salaries[1] = 3500.0
    salaries[2] = 4500.0

    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * 1.83
    }

    salaries.forEach { println(it) }

    remuneracao.sort()
    remuneracao.forEach { println(it) }

    println(remuneracao.maxOrNull())
    println(remuneracao.minOrNull())
    println(remuneracao.average())

    val salariosMaiorDoisMil = remuneracao.filter { it > 2000.00 }
    salariosMaiorDoisMil.forEach { println(it) }

}