import java.util.Scanner;

public class ArregloNumeroMaximo {
    public static void main(String[] args) {
        int[] a = new int[7];
        int max = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 7 números enteros entre 11 y 99: ");
            a[i] = s.nextInt();
            while (a[i] < 11 || a[i] > 99) {
                System.out.println("Vuelve a ingresar numero! Recuerde, entre 11 y 99: ");
                a[i] = s.nextInt();
            }
        }
            System.out.println("Arreglo: ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
                max = (a[max] > a[i]) ? max : i;
            }
        System.out.println("\nEl numero máximo es: " + a[max]);
    }
}