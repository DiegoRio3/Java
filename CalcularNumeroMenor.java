import java.util.Arrays;
import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numero a comparar: ");
        int cantidad = scanner.nextInt();
        int[] numeros= new int[cantidad];
        System.out.println("Ingrese un numero: ");
        numeros [0] = scanner.nextInt();
        int numMin= numeros[0];
        for (int i = 1; i < cantidad; i++) {
            System.out.println("Ingrese un numero: ");
            numeros [i] = scanner.nextInt();
            if (numMin>numeros[i]) {
                numMin = numeros[i];
            }
        }

        System.out.println("Los numero ingresados son = " + Arrays.toString(numeros));
        System.out.println("El numero mínimo es = " + numMin);
        String menor10 = numMin < 10 ? "El numero menor es menor que 10!" : "El numero menor es igual o mayor que 10!";
        System.out.println("menor10 = " + menor10);
    }
}

    /*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
    usando la clase Scanner ingresar la cantidad de números a comparar,
    luego utilizando una sentencia for iterar el número de veces (ingresado) para pedir el numero entero, entonces se requiere:

        Calcular el menor número e imprimir el valor.

        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no,
        imprimir " el numero menor es igual o mayor que 10!".

     */