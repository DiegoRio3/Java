import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosPerfeccionadoEntradaScanner {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try { numeroDecimal = scanner.nextInt();}  //Integer.parseInt(numeroStr); }
        catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un numero entero!");
            main(args);
            System.exit(0); }
        System.out.println("numero Decimal= " + numeroDecimal);
        String resultadoBinario = "El numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "El numero octal de " + numeroDecimal + " es " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "El numero hexadecimal de " + numeroDecimal + " es " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
        System.out.println(mensaje);
    }
}
