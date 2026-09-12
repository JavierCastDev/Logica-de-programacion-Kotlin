package org.logicakotlin.ejercicios

//¿ES UN NÚMERO PRIMO?

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

class Ejercicio04 {
    fun esPrimo() {
        for (i in 2..100) {
            var esPrimo = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    esPrimo = false
                }
            }
            if (esPrimo) {
                println("$i es primo")
            }
        }
    }
}

fun main() {
    Ejercicio04().esPrimo()
}