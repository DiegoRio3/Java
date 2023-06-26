import java.util.Scanner;

public class EjemploLoginUsandoArreglos {
    public static void main(String[] args) {
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "diego";
        passwords[0] = "12345";
        usernames[1] = "adrian";
        passwords[1] = "12345";
        usernames[2] = "pepe";
        passwords[2] = "99999";

        //String[] usernames = {"diego", "andrian", "pepe"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese usuario: ");
        String u = scanner.next();
        System.out.println("Ingrese password: ");
        String p = scanner.next();
        boolean esAutenticado = false;
        for (int i=0; i < usernames.length; i++) {
            if((u.equals(usernames[i]) && p.equals(passwords[i]))) {
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        }else {
            System.out.println("El usuario o el password es incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
