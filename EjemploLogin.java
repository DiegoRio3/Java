import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {
        String username = "diego";
        String password = "12345";

        String username2 = "adrian";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario: ");
        String u = scanner.next();
        System.out.println("Ingrese password: ");
        String p = scanner.next();
        boolean esAutenticado = false;

        if((u.equals(username) && p.equals(password)) || (u.equals(username2) && p.equals(password2))) {
            esAutenticado = true;
        } else {
            System.out.println("El usuario o el password es incorrecto!");
        }

        if(esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
