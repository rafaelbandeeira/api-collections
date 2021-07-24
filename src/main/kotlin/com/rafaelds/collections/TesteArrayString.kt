package com.rafaelds.collections

fun main() {
    val names = Array(3) {""}
    val nomenclatura = arrayOf("Maria", "Meteso", "Monique")

    names[0] = "Mateuso"
    names[1] = "Geruso"
    names[2] = "Faboso"

    for (name in names) println(name)

    names.forEach { println(it) }

    for (nomen in nomenclatura) println(nomen)

    nomenclatura.forEach { println(it) }


}