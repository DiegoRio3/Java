/*
Assignment: Sistema de notas de alumnos
Crear un sistema de reportes de notas de los alumnos
Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
 ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas
 una a una para realizar los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */

import java.util.Scanner;

public class SistemaNotasAlumnos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double notasFinales = 0.0, notasMayoresA5 = 0.0, notasInferioresA4 = 0.0, promedioTotal = 0.0;
        int contadorMayoresA5 = 0, contadorInferioresA4 = 0, contadorDe1 = 0;

        bucle:
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese 20 notas en una escala del 1 al 7: ");
            notasFinales = s.nextDouble();
            promedioTotal = promedioTotal + notasFinales;

            if (5.0 < notasFinales) {
                notasMayoresA5 =  notasMayoresA5 + notasFinales;
                contadorMayoresA5++;

            } else if (notasFinales < 4.0 && 1 < notasFinales) {
                notasInferioresA4 = notasInferioresA4 + notasFinales;
                contadorInferioresA4++;

            } else if (notasFinales == 1) {
                contadorDe1++;

            } else if (notasFinales == 0) {
                System.out.println("Error, se finaliza el programa.");
                break bucle;
            }
        }

        System.out.println("EL promedio de las notas mayores a 5 es: " + (notasMayoresA5 / contadorMayoresA5));
        System.out.println("El promedio de las notas inferiores a 4 es: " + (notasInferioresA4 / contadorInferioresA4));
        System.out.println("La cantidad de notas 1 es: " + contadorDe1);
        System.out.println("El promedio final es: " + (promedioTotal / 20));
    }
}
