/*
Assignment: Imprimir Histograma
Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento
aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
 incluso si no están presente en el arreglo.
Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
    1: ***
    2:
    3: *
    4: *****
    5: *
    6: **
Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
 */

import java.util.Scanner;

public class ImprimirHistograma {

    public static void main(String[] args) {
        int[] a = new int[12];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 12 números (entre 1-6: ");
            a[i] = s.nextInt();

            while (a[i] < 1 || 6 < a[i]) {
                System.out.println("Recuerde! Ingrese un numero del 1 al 6: ");
                a[i] = s.nextInt();
            }
        }

        System.out.println("Arreglo: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        StringBuilder unos = new StringBuilder();
        StringBuilder dos = new StringBuilder();
        StringBuilder tres = new StringBuilder();
        StringBuilder cuatro = new StringBuilder();
        StringBuilder cinco = new StringBuilder();
        StringBuilder seis = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 1:
                    unos.append("*");
                    break;
                case 2:
                    dos.append("*");
                    break;
                case 3:
                    tres.append("*");
                    break;
                case 4:
                    cuatro.append("*");
                    break;
                case 5:
                    cinco.append("*");
                    break;
                case 6:
                    seis.append("+");
                    break;
            }
        }

        System.out.println("unos = " + unos);
        System.out.println("dos = " + dos);
        System.out.println("tres = " + tres);
        System.out.println("cuatro = " + cuatro);
        System.out.println("cinco = " + cinco);
        System.out.println("seis = " + seis);
    }

}