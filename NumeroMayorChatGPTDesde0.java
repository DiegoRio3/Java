package org.diego.api.stream.ejemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class NumeroMayorChatGPTDesde0 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 9, 5, 3, 4, 15, 25, 12);
        Integer numeroMayor = encontrarNumeroMayor(numeros, x -> x);
        System.out.println("El numero mayor es: " + numeroMayor);
    }

    private static <T, R extends Comparable<R>> R encontrarNumeroMayor(List<T> lista, Function<T, R> mapper) {
        return lista.stream()
                .map(mapper)
                .reduce((a, b) -> a.compareTo(b) > 0 ? a : b)
                .orElseThrow(() -> new IllegalArgumentException("La lista no puede estar vacía"));
    }
}
