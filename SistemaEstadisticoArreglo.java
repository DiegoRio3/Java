import java.util.Scanner;

public class SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        int[] a = new int[7];
        int positivos = 0,negativos = 0, ceros = 0, cantidadPos = 0, cantidadNeg = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese 7 números: ");
            a[i] = s.nextInt();
            if(a[i]>0){
                positivos += a[i];
                cantidadPos++;
            } else if (a[i]<0) {
                negativos += a[i];
                cantidadNeg++;
            } else if (a[i]==0) {
                ceros++;
            }
        }
        System.out.println("Arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        if(cantidadPos>0) {
            System.out.println("Promedio de números positivos: " + (positivos/cantidadPos));
        } else {
            System.out.println("No hay números positivos en el arreglo");
        }
        if (cantidadNeg>0) {
            System.out.println("Promedio de números negativos: " + (negativos / cantidadNeg));
        } else {
            System.out.println("No hay números negativos en el arreglo");
        }
        System.out.println("Cantidad de ceros: " + ceros);
    }
}