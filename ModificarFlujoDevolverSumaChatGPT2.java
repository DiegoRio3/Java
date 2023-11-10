package org.diego.api.stream.ejemplos;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ModificarFlujoDevolverSumaChatGPT2 {

    public static void main(String[] args) {
        double[] numeros = IntStream.rangeClosed(1, 100)
                .filter(x -> x % 10 != 0)
                .mapToDouble(x -> x / 2.0)
                .toArray();

        double suma = Arrays.stream(numeros).sum();
        System.out.println("Resultado: " + suma);
    }
}
