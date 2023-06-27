/*
En un arreglo ordenado agregar un elemento en una posición adecuada de manera que siga ordenado
 */
import java.util.Scanner;

public class AgregarElementoPosicionIndicada {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[a.length+1];
        int num, posicion=0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 10 números enteros: ");
            a[i] = s.nextInt();
        }
        System.out.println("Arreglo: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nAgregar un elemento al arreglo: ");
        num = s.nextInt();
        System.out.print("\nIndicar en que posición agregarlo: ");
        posicion = s.nextInt();

        System.arraycopy(a, 0,b, 0,b.length-1);

        for(int i = b.length-2; i>=posicion; i--) {
            b[i + 1] = b[i];
        }
        b[posicion] = num;

        System.out.println("Arreglo desplazado: ");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
