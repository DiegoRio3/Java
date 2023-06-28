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


/*
Ejercicio del curso
-------------------------------------------------------------------------------------------


import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
    }
}
 */