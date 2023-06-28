/*
Assignment: Mayor ocurrencia en el arreglo
Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también
imprimir la cantidad de veces que aparece en el arreglo.

Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
Como resultado debería imprimir lo siguiente:
    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5

En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
 */

import java.util.Scanner;

public class MayorOcurrenciaArreglo2 {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 10 números (entre 1-9: ");
            a[i] = s.nextInt();

            while (a[i] < 1 || 10 < a[i]) {
                System.out.println("Recuerde! Ingrese un numero del 1 al 9: ");
                a[i] = s.nextInt();
            }
        }

        System.out.println("Arreglo: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] < a[j]) {
                    int auxiliar = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("Arreglo ordenado: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        int contador = 0, maxcont = 0, numero = 0;

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {
                   contador++;
                }
            }

            if (maxcont <= contador) {
                maxcont = contador;
                numero = i;
            } else {
                maxcont = maxcont;
            }

            contador = 0;
        }

        System.out.println("La mayor ocurrencia es= " + maxcont);
        System.out.println("El numero que mas se repite es= " + numero);
    }

}