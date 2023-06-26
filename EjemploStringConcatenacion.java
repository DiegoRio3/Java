public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andres Guzman";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);
        int numA = 10;
        int numB = 5;
        System.out.println(detalle + " " + (numA + numB));
        System.out.println(numA + numB + " " + detalle);
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2: " + detalle2);
    }
}
