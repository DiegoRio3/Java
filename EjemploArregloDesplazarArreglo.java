import java.util.Scanner;

//Este arreglo te desplaza una posición el arreglo guardando el dato en un a variable "último"
public class EjemploArregloDesplazarArreglo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int ultimo;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        ultimo = a[a.length-1];
        for (int i = a.length - 2; i>=0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = ultimo;
        System.out.println("\nArreglo desplazado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
