package org.diego.api.stream.ejemplos;

import java.util.function.Function;
import java.util.stream.Stream;

public class NumeroMayorChatGPT {

    public static void main(String[] args) {
        Stream<Integer> x = Stream.of(1, 2, 9, 5, 3, 4, 15, 25, 12);
        Function<Stream<Integer>, Integer> mayor = c -> c.reduce(Integer.MIN_VALUE, Integer::max);
        int resultado = mayor.apply(x);
        System.out.println("El numero mayor es: " + resultado);
    }
}
