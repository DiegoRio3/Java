import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args)
    {
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero: ");
        int numeroDecimal = Integer.parseInt(numeroStr);
        System.out.println("numero Decimal= " + numeroDecimal);

        System.out.println("El numero binario de " + numeroDecimal + "es " + Integer.toBinaryString(numeroDecimal));
        int numeroBinario = 0b11110;
        System.out.println("numero Binario= " + numeroBinario);

        System.out.println("El numero octal de " + numeroDecimal + "es " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0x1e;
        System.out.println("numero Octal= " + numeroOctal);

        System.out.println("El numero hexadecimal de " + numeroDecimal + "es " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0b11110;
        System.out.println("numero Hex= " + numeroHex);

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showInputDialog(null, mensaje);

    }
}
