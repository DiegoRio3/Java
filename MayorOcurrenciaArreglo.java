import java.util.Scanner;

public class MayorOcurrenciaArreglo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int recurrencia = 0, numRecurrente = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 10 números (entre 1-9: ");
            a[i] = s.nextInt();
            while(a[i]<1 || a[i]>10) {
                System.out.println("Recuerde! Ingrese un numero del 1 al 9: ");
                a[i] = s.nextInt();
            }
        }
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j+1]<a[j]) {
                    int auxiliar = a[j];
                    a[j] = a[j+1];
                    a[j+1] = auxiliar;
                }
            }
        }

        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int contador = 0;
        for(int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[i]==a[j]) {
                    contador++;
                    System.out.println("iguales " + a[i] + "-" + a[j] + " contador en: " + contador);
                }
            }
        }
        System.out.println("contador = " + contador);


    }
}