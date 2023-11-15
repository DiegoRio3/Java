/*
Assignment 33: Aplanar un arreglo bidimensional en un nivel y eliminar repetidos

El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.
Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.
Por ejemplo, para el arreglo:
String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
Debería quedar:
{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
 */

package org.diego.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.Stream;

public class Assignment33 {

    public static void main(String[] args) {

        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Stream<String[]> primerNivel = Arrays.stream(lenguajes);
        primerNivel.flatMap(x -> {
            for (String[] lenguaje : lenguajes) {
                for (String s : lenguaje) {
                    return Stream.of(x);
                }
            }
            return Stream.empty();
        })
                .distinct()
                .forEach(System.out::println);
    }
}
