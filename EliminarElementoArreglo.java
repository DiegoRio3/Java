/*
Eliminar un elemento en una posición sin dejar hueco
 */

import java.util.Scanner;

public class EliminarElementoArreglo {

    public static void main(String[] args) {
        int[] a = new int[10];
        int num, posicion = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 10 números enteros: ");
            a[i] = s.nextInt();
        }

        System.out.println("Arreglo: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nIndique elemento a eliminar: ");
        num = s.nextInt();

        for (int i = 0; i < a.length; i++) {
            while (num == a[i]) {
                posicion = i;
                break;
            }
        }

        for (int i = posicion; i < (a.length - 1); i++) {
            a[i] = a[i + 1];
        }

        System.out.println("Arreglo desplazado: ");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);

        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " => " + b[i]);
        }
    }
}
