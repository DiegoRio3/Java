/*
Expresión Lambda que cuenta la cantidad de veces que se repiten las palabras de una frase y devuelva la mas repetida
Para la tarea se pide como requerimiento escribir una expresión lambda que cuenta la cantidad de veces que se repiten
las palabras de una frase y devuelva la mas repetida, según lo siguiente:
La expresión lambda debe recibir por argumento una frase u oración y devolver un objeto Map que contenga
la palabra mas repetida de la frase como llave y la cantidad de veces que se repite como valor.
Tiene que devolver un objeto Map de java, por ejemplo usando la forma clásica:
    Map<String, Integer> resultado = new HashMap();
    resultado.put(palabra, max);
    return resultado;
o bine usar el helpers abreviado y equivalente:
return Collections.singletonMap(palabra, max)
Mostrar el resultado en consola iterando el map o bien obteniendo el primer elemento con get().
 */

package org.diego.cantidadpalabrasrepetidas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EjemploPalabraMasRepetida {

    public static void main(String[] args) {
        Function<String, Map> contador = frase -> {
            String[] palabras = frase.split("[ ,.]");
            Map<String, Integer> cantidadPalabras = new HashMap<>();
            for (String palabra : palabras) {
                palabra = palabra.toLowerCase();

                if (cantidadPalabras.containsKey(palabra)) {
                    cantidadPalabras.put(palabra, cantidadPalabras.get(palabra) + 1);

                } else {
                    cantidadPalabras.put(palabra, 1);
                }
            }

            return cantidadPalabras;
        };

        Map<String, Integer> resultado = new HashMap(contador.apply("Este texto ejemplo para verificar el texto ejemplo. Ejemplo del ejercicio, ejemplo 10 solo texto."));

        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            System.out.println("Palabra: " + entry.getKey() + ", Frecuencia: " + entry.getValue());
        }

        int max = Integer.MIN_VALUE;
        String claveMax = null;

        for (Map.Entry<String, Integer> entry : resultado.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                claveMax = entry.getKey();
            }
        }

        System.out.println("\nLa palabra más repetida es '" + claveMax + "', se repitió " + max + " veces.");
    }
}
