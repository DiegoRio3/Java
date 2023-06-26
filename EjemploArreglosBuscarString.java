import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        String[] a = new String[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        for(int i = 0; i < a.length; i++) {
            a[i] = s.next();
        }
        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();
        int i = 0;
        for (;i < a.length && !a[i].equalsIgnoreCase(nombre); i++) {}
        if(i==a.length) {
            System.out.println("Nombre no encontrado");
        } else if (a[i].toLowerCase().compareTo(nombre.toLowerCase())==0) {
            System.out.println("Encontrado en la posición: " + i);
        }
    }
}
