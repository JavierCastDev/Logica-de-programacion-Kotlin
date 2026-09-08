package org.logicakotlin.ejercicios

//LA SUCESIÓN DE FIBONACCI

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

class Ejercicio03 {

    fun fibonacci() {
        var contador = 0
        var a: Long = 0
        var b: Long = 1

        println(a)
        println(b)
        while (contador < 48) {
            val c = a + b
            println(c)
            a = b
            b = c
            contador++
        }
    }
}

fun main() {
    Ejercicio03().fibonacci()
}