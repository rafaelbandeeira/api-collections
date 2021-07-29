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
}

data class Funcionarios(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}
