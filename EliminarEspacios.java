/*

Expresión Lambda que elimine espacios, comas y puntos de una frase y además la devuelva la frase convertida en mayúscula.

 */

package org.diego.expresion.lambda;

import java.util.function.Consumer;

public class EliminarEspacios {

    public static void main(String[] args) {
        Consumer<String> convertidor = texto -> {
            String textoSinEspacios = texto.replaceAll("[ ,.]", "");
            String textoMayusculas = textoSinEspacios.toUpperCase();
            System.out.println("Convertimos el texto: " + texto);
            System.out.println("\nSacamos los espacios, puntos y comas, y convertimos el texto en Mayúsculas: ");
            System.out.println(textoMayusculas);
        };

        convertidor.accept("Este es el texto, que vamos, a convertir. Es solo para probar esta función.");
    }
}
