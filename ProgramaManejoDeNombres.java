import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = scanner.nextLine();
        String n1 = nombre.substring(1,2).toUpperCase().concat(".").concat(nombre.substring(nombre.length()-2));

        System.out.println("Ingrese un nombre: ");
        nombre = scanner.nextLine();
        String n2 = nombre.substring(1,2).toUpperCase().concat(".").concat(nombre.substring(nombre.length()-2));

        System.out.println("Ingrese un nombre: ");
        nombre = scanner.nextLine();
        String n3 = nombre.substring(1,2).toUpperCase().concat(".").concat(nombre.substring(nombre.length()-2));

        String resultado = n1.concat("_").concat(n2).concat("_").concat(n3);
        System.out.println("resultado : " + resultado);
    }
}
    /*\Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos
    como argumentos de línea de comandos.
        Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter
        pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona.
        Por ejemplo para Andres debe quedar como N.es
        Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
        Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
        N.es_A.ia_E.pe\*/