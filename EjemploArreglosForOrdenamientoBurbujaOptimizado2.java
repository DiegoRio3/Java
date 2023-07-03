public class EjemploArreglosForOrdenamientoBurbujaOptimizado2 {
    public static void sortBurbuja(Object[] arreglo) {
        int contador = 0;
        for(int i = 0; i < arreglo.length - 1; i++) {
            for(int j = 0; j < arreglo.length -1 - i; j++) {
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 6408", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Ait", "Chromecast 4ta Generación", "Bicicleta Oxford"};
        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("==== Usando for ====");
        for(int i = 0; i < total; i++) {
            System.out.println("Para indice: " + i + ": " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 35;
        numeros[3] = -1;

        sortBurbuja(numeros);

        System.out.println("==== Usando for ====");
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Para indice: " + i + ": " + numeros[i]);
        }
    }
}
