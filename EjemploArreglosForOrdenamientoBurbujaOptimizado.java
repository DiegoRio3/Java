public class EjemploArreglosForOrdenamientoBurbujaOptimizado {
    public static void arregloInverso(String[] arreglo) {
        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i<total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 6408", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Ait", "Chromecast 4ta Generación", "Bicicleta Oxford"};
        int total = productos.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++) {
            for(int j = 0; j < total -1 - i; j++) {
                if (productos[j+1].compareTo(productos[j]) < 0) {
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        //Contamos el número de iteraciones que hace el método burbuja

        //Arrays.sort(productos);
        //arregloInverso(productos);
        //Collections.reverse(Arrays.asList(productos));
        //API para revertir una lista, en este caso convertimos el arreglo en una lista

        System.out.println("==== Usando for ====");
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice: " + i + ": " + productos[i]);
        }
    }
}
