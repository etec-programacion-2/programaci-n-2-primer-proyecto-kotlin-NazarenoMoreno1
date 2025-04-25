package org.example

import java.time.LocalDate

fun main() {
    println("Hola, Kotlin")
    val nombre = "Nazareno"
    val fechadehoy = LocalDate.now()
    println("Mi nombre es $nombre")
    println("Esta es la fecha de hoy $fechadehoy")

    val club: String = "Anzorena"
    val camiseta: Int = 10
    val puntos: Double = 7.6
    val capitan: Boolean = true
    println("Hola soy jugador del club $club, juego con la camiseta numero $camiseta, tengo un promedio de $puntos puntos soy capitan de mi equipo: $capitan")
    val base: Double = 8.2
    val altura: Double = 16.7
    val area: Double = base * altura
    println("El área es de: $area")

    fun esParOImpar(numero: Int): String {
    return when {
        numero % 2 == 0 -> "Par"
        else -> "Impar"
    }
}