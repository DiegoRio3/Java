/*
Assignment 35: Calcular edad
Calcular edad ingresando la fecha de nacimiento de una persona con java 8 date time.
Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha
del tipo LocalDate y calcular la edad de la persona de acuerdo a la fecha actual.
 */

package org.diego.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularEdad {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa fecha de Nacimiento: ");
        String fechaIngresada = scanner.nextLine();

        LocalDate fechaCumpleanios = LocalDate.parse(fechaIngresada);

        Period edad = Period.between(fechaCumpleanios, fechaActual);
        System.out.println("\nEdad: " + edad.getYears());
    }
}
