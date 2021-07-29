package com.rafaelds.collections

fun main() {
    val rafael = Funcionarios("Rafael", 955.0)
    val wesley = Funcionarios("Wesley", 610.0)
    val tiago = Funcionarios("Tiago", 142.0)
    val funcionarios = listOf<Funcionarios>(rafael, wesley, tiago)

    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it.toString()) }
    println(funcionarios.find { it.nome == "Renata" })
    println("---------------WORKING WITH SET----------------")

    val funcionario1 = setOf(rafael, wesley)
    val funcionario2 = setOf(tiago)

    val resultUnion = funcionario1.union(funcionario2)
    println(resultUnion)
    println("---------------------------")

    val resultSubtract = resultUnion.subtract(funcionario1)
    println(resultSubtract)
    println("---------------------------")

    val resultIntersect = resultUnion.intersect(funcionario2)
    println(resultIntersect)

}
