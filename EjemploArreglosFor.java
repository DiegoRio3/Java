import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int total = productos.length;
        productos[0] = "Kingston Pendrive 6408";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Ait";
        productos[5] = "Chroomecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";
        Arrays.sort(productos);

        System.out.println("==== Usando for ====");
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice: " + i + ": " + productos[i]);
        }

        System.out.println("==== Usando for each ====");
        for(String prod: productos) {
            System.out.println("producto = " + prod);
        }

        System.out.println("==== Usando while ====");
        int j = 0;
        while (j<total) {
            System.out.println("Para indice: " + j + ": " + productos[j]);
            j++;
        }

        System.out.println("==== Usando do while ====");
        int i = 0;
        do {
            System.out.println("Para indice: " + i + ": " + productos[i]);
            i++;
        } while (i<total);


        System.out.println("\n\n========");
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        for(int k=0; k < totalNumeros; k++) {
            numeros[k] = k*3;
        }
        System.out.println("==== Usando for ====");
        for(int k=0; k < totalNumeros; k++) {
            System.out.println("Para indice: " + k + ": " + numeros[k]);
        }
    }
}
