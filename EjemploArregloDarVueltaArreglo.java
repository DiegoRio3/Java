import java.util.Scanner;

public class EjemploArregloDarVueltaArreglo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        int[] opuesto = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int aux = 1;
        for (int i = 0; i <= a.length - 2; i++) {
            opuesto[aux++] = a[i];
        }
        opuesto[0] = a[9];
        System.out.println("\nArreglo desplazado: ");
        for (int i = 0; i < opuesto.length; i++) {
            System.out.print(opuesto[i] + " ");
        }
    }
}
