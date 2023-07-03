/*
Assignment: Ordenar el arreglo de la forma último primero, etc
Ordenar los elementos del arreglo de 10 números según requerimientos.
Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, el segundo,
el antepenúltimo, el tercero, y así sucesivamente.
 */

import java.util.Scanner;

public class ArregloUltimoPrimero {

    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 10 números enteros: ");
            a[i] = s.nextInt();
        }

        System.out.println("Arreglo: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("Arreglo ordenado ultimo - primero: ");

        for (int i = 0; i < (a.length / 2); i++) {
            System.out.println(a[a.length - 1 - i]);
            System.out.println(a[i]);
        }
    }
}
