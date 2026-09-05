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
        if (palabraUno.uppercase().reversed() == palabraDos.uppercase()) {
            println(true)
        } else println(false)
    }
}

fun main() {
    Ejercicio02().esAnagrama("panadero", "oredanap")
}