package com.rafaelds.collections

fun main() {
    val rafael = Funcionarios("Rafael", 955.0)
    val wesley = Funcionarios("Wesley", 610.0)
    val tiago = Funcionarios("Tiago", 142.0)

    val repositorio = Repositorio<Funcionarios>()

    repositorio.create(rafael.nome, rafael)
    repositorio.create(wesley.nome, wesley)
    repositorio.create(tiago.nome, tiago)

    print((repositorio.findById(tiago.nome)))
}