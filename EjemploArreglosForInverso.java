import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 6408", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Ait", "Chromecast 4ta Generación", "Bicicleta Oxford"};
        int total = productos.length;

        /*      Esta opcion es mas dinamica, solo se muestra la otra.
        productos[0] = "Kingston Pendrive 6408";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Ait";
        productos[5] = "Chroomecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";
        */

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

    }
}
