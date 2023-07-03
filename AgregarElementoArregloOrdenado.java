import java.util.Scanner;

public class AgregarElementoArregloOrdenado {
    public static void main(String[] args) {
        int[] a = new int[10];
        int num, posicion=0;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese 9 números enteros: ");
            a[i] = s.nextInt();
        }
        System.out.println("Arreglo: ");
        for(int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nAgregar un elemento al arreglo: ");
        num = s.nextInt();

        for(int i = 0; i < a.length-1; i++) {
            while(num >= a[i]) {
                posicion = i+1;
                break;
            }
        }

        for(int i = a.length-2; i>=posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = num;
        System.out.println("Arreglo desplazado: ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
