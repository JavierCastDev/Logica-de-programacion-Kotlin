package org.logicakotlin.ejercicios

//¿QUE ES UN ANAGRAMA?

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

class Ejercicio02 {

    fun esAnagrama(palabraUno: String, palabraDos: String) {
        if (palabraUno.equals(palabraDos, ignoreCase = true)) {
            println(false)
        } else {
            val palabraUnoOrdenada = palabraUno.uppercase().toCharArray().sorted().joinToString("")
            val palabraDosOrdenada = palabraDos.uppercase().toCharArray().sorted().joinToString("")

            if (palabraUnoOrdenada != palabraDosOrdenada) {
                println(false)
            } else {
                println(true)
            }
        }
    }
}

fun main() {
    Ejercicio02().esAnagrama("Capi", "Pica")
}