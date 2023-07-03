/*
Assignment: Multiplicar dos números
Multiplicar dos números sin usar el símbolo de multiplicación.
Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos,
pero sin usar el símbolo de multiplicación (*).
Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios,
donde menos por menos es positivo.
 */

import java.util.Scanner;

public class MuliplicarDosNumeros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresar numero a multiplicar: ");
        int numeroMul1 = s.nextInt();
        System.out.println("Ingresar segundo numero a multiplicar: ");
        int numeroMul2 = s.nextInt();
        int resultado = 0;

        for (int i = 0; i < Math.abs(numeroMul2); i++)  {
            resultado += numeroMul1;
        }

        System.out.println("resultado = " + resultado);
    }
}
