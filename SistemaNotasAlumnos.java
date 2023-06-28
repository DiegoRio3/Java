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


/*
Y este es el programa del curso
-------------------------------------------------------------------------


import java.util.Scanner;

public class PromedioNotasAlumnos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}
 */