/*
Assignment 32: Obtener el numero mayor en un arreglo
Obtener el numero mayor en un arreglo con programación funcional lambda y api stream
El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando programación funcional,
implementando la expresión lambda Function<T,R> (que viene predefinida) con el api stream y operador reduce.
 */

package org.diego.api.stream.ejemplos;

import java.util.function.Function;
import java.util.stream.Stream;

public class NumeroMayor {

    public static void main(String[] args) {
        Stream<Integer> x = Stream.of(1, 2, 9, 5, 3, 4, 15, 25, 12);
        Function<Stream, Integer> mayor = c -> x.reduce(0, (a, b) -> Integer.max(a, b));
        int resultado = mayor.apply(x);
        System.out.println("El numero mayor es: " + resultado);
    }
}
