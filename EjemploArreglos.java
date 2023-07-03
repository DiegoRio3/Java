import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 6408";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Ait";
        productos[5] = "Chroomecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1[0] = " + prod1);
        System.out.println("prod1[1] = " + prod2);
        System.out.println("prod1[2] = " + prod3);
        System.out.println("prod1[3] = " + prod4);
        System.out.println("prod1[4] = " + prod5);
        System.out.println("prod1[5] = " + prod6);
        System.out.println("prod1[6] = " + prod7);


        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("1");
        numeros[2] = 35;
        numeros[3] = -1;
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
