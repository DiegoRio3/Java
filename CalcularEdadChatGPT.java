package org.diego.datetime.ejemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalcularEdadChatGPT {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la fecha de nacimiento
        System.out.print("Ingresa tu fecha de nacimiento (formato dd-MM-yyyy): ");
        String fechaNacimientoString = scanner.nextLine();

        // Definir el formato de la fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Convertir la cadena ingresada a un objeto LocalDate
            LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, formatter);

            // Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Calcular la edad
            int edad = calcularEdad(fechaNacimiento, fechaActual);

            // Mostrar la edad
            System.out.println("Tu edad es: " + edad + " años");
        } catch (Exception e) {
            System.out.println("Error al procesar la fecha. Asegúrate de ingresarla en el formato correcto.");
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }

    // Método para calcular la edad
    private static int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        // Ajustar la edad si aún no ha pasado el cumpleaños este año
        if (fechaNacimiento.getDayOfYear() > fechaActual.getDayOfYear()) {
            edad--;
        }

        return edad;
    }
}
