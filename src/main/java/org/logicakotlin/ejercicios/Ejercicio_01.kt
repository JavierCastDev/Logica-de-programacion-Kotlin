package org.logicakotlin.ejercicios

//El Famoso Fizz Buzz

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

class Ejercicio_01 {
    var resultado = ""
    fun ejercicioUno() {
        for (i in 1..100) {
            if (i % 3 == 0 && i % 5 == 0) {
                resultado = "fizzbuzz"
            } else if (i % 5 == 0) {
                resultado = "buzz"
            } else if (i % 3 == 0) {
                resultado = "fizz"
            } else {
                resultado = ""
            }
            println("Numero: " + i + " " + resultado)
        }
    }
}

fun main() {
    Ejercicio_01().ejercicioUno()
}