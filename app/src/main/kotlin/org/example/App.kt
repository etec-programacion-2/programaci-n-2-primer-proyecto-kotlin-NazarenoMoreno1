package org.example

import java.time.LocalDate

fun main() {
    //Paso 1
    println("Hola, Kotlin")
    val nombre = "Nazareno"
    val fechadehoy = LocalDate.now()
    println("Mi nombre es $nombre")
    println("Esta es la fecha de hoy $fechadehoy")

    //Paso 2 
    val club: String = "Anzorena"
    val camiseta: Int = 10
    val puntos: Double = 7.6
    val capitan: Boolean = true
    println("Hola soy jugador del club $club, juego con la camiseta numero $camiseta, tengo un promedio de $puntos puntos soy capitan de mi equipo: $capitan")
    val base: Double = 8.2
    val altura: Double = 16.7
    val area: Double = base * altura
    println("El área es de: $area")
    
    //Paso 3
    val num1 = -5
    when {
        num1 > 0 -> println ("positivo")
        num1 < 0 -> println ("negativo")
        else -> println ("cero")
    }
    if (num1 > 0) {
        println ("positivo")
    } else if (num1 < 0) {
        println ("negativo")
    } else {
        println ("cero")
    }
}