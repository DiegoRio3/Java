/*
Assignment: Mostrar ordenados dos números
Pedir dos números y mostrarlos ordenados de mayor a menor
El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
Podría ser utilizando operador ternario.
 */

import java.util.Scanner;

public class NumerosDeMayorAMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int num2 = scanner.nextInt();

        String resultado = num2 < num1
                ? ("Número mayor " + num1 + ", numero menor: " + num2)
                : ("Número mayor " + num2 + ", numero menor: " + num1);

        System.out.println(resultado);
    }

}