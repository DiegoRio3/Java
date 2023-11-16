package org.diego.api.stream.ejemplos;

import java.util.stream.IntStream;

public class ModificarFlujoDevolverSumaChatGPT {

    public static void main(String[] args) {
        double resultado = IntStream.rangeClosed(1, 100)
                .filter(num -> num % 10 != 0)
                .mapToDouble(num -> (double) num / 2)
                .reduce(0, (acc, num) -> acc + num);

        System.out.println("Resultado: " + resultado);
    }
}
