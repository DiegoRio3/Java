/*
        Assignment 31: Modificar flujo y devolver la suma

        Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, utilizando el api stream
        se pide eliminar los divisibles en 10, luego convertir los elementos restante del flujo en tipo double
        y dividirlos en 2, para finalmente devolver la suma total de todos ellos usando el operador terminal reduce.
        El resultado debería ser 2250.0
*/

package org.diego.api.stream.ejemplos;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.DoubleStream;

public class ModificarFlujoDevolverSuma {

    public static void main(String[] args) {
        AtomicInteger contador = new AtomicInteger(0);
        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = contador.incrementAndGet();
            System.out.println("Numero: " + numeros[i]);
        }

        System.out.println("\n/////////////////\n");

        DoubleStream divisibles = DoubleStream.of(Arrays.stream(numeros)
                .filter(x -> !(x % 10 == 0)).asDoubleStream()
                .map(x -> x / 2)
                .sum());

        divisibles.forEach(System.out::println);
    }
}
