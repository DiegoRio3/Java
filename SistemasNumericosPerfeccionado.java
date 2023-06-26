import javax.swing.*;

public class SistemasNumericosPerfeccionado {
    public static void main(String[] args)
    {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero: ");
        int numeroDecimal = 0;
        try { numeroDecimal = Integer.parseInt(numeroStr); }
        catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null,"Error debe ingresar un numero entero");
            main(args);
            System.exit(0); }
        System.out.println("numero Decimal= " + numeroDecimal);

        String resultadoBinario = "El numero binario de " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        int numeroBinario = 0b11110;
        System.out.println("numero Binario= " + numeroBinario);

        String resultadoOctal = "El numero octal de " + numeroDecimal + " es " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 0x1e;
        System.out.println("numero Octal= " + numeroOctal);

        String resultadoHex = "El numero hexadecimal de " + numeroDecimal + " es " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0b11110;
        System.out.println("numero Hex= " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showInputDialog(null, mensaje);

    }
}
