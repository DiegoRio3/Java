import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 10 números enteros= ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int totalPares = 0, totalImpares = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        int[] pares = new int[totalPares];
        int[] impares = new int[totalImpares];
        int contPares = 0, contImpares = 0;
        for(int i = 0; i < a.length; i++) {
           if (a[i]%2==0) {
               pares[contPares++] = a[i];
           } else {
               impares[contImpares++] = a[i];
           }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println("\n\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}