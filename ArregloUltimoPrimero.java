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
        for (int i = 0; i < a.length / 2; i++) {
            System.out.println(a[a.length - 1 - i]);
            System.out.println(a[i]);
        }
    }
}