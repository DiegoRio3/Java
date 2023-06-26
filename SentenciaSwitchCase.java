public class SentenciaSwitchCase {
    public static void main(String[] args) {
        String nombre = "juan";
        switch (nombre){
            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "juan":
                System.out.println("Hola juan, bienvenido");
                break;
            case "andres":
                System.out.println("Hola andres, bienvenido");
                break;
            default:
                System.out.println("Usuario desconocido");
                break;
        }
    }
}
