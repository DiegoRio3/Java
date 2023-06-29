/*
Assignment: Sistema estadístico de un arreglo
Sistema estadístico con elementos de un arreglo
Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
 el promedio de los negativos y contar el número de ceros.
 */

import java.util.Scanner;

public class SistemaEstadisticoArreglo {

    public static void main(String[] args) {
        int[] a = new int[7];
        int positivos = 0, negativos = 0, ceros = 0, cantidadPos = 0, cantidadNeg = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 7 números: ");
            a[i] = s.nextInt();

            if (0 < a[i]){
                positivos += a[i];
                cantidadPos++;

            } else if (a[i] < 0) {
                negativos += a[i];
                cantidadNeg++;

            } else if (a[i] == 0) {
                ceros++;
            }
        }

        System.out.println("Arreglo: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        if (0 < cantidadPos) {
            System.out.println("Promedio de números positivos: " + (positivos / cantidadPos));

        } else {
            System.out.println("No hay números positivos en el arreglo");
        }

        if (0 < cantidadNeg) {
            System.out.println("Promedio de números negativos: " + (negativos / cantidadNeg));

        } else {
            System.out.println("No hay números negativos en el arreglo");
        }

        System.out.println("Cantidad de ceros: " + ceros);
    }
}
