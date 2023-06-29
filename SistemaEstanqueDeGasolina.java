/*
Assignment: Sistema Estanque de gasolina
Sistema Estanque de gasolina
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
se requiere un programa que pida la medida actual en litros
y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
La medida o capacidad actual del estanque puede ser en tipo double,
para una mejor precisión, pero tambien puede ser del tipo int.
    Si la capacidad actual es 70 litros: imprimir Estanque lleno
    Si está entre 60 y menor a 70: imprimir Estanque casi lleno
    Si está entre 40 y menor a 60: imprimir Estanque  3/4
    Si está entre 35 y menor a 40: imprimir Medio Estanque
    Si está entre 20 y menor a 35: imprimir Suficiente
    Si está entre 1 y menor a 20: imprimir Insuficiente
 */

import java.util.Scanner;

public class SistemaEstanqueDeGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual del estanque: ");
        double capacidad = scanner.nextDouble();
        String resultado = "";

        if (40 <= capacidad) {
            if (70 <= capacidad){
                resultado = "Estanque Lleno";

            } else {
                resultado = 60 <= capacidad
                        ? "Estanque casi lleno"
                        : "Estanque 3/4";
            }

        } else {
            if (20 <= capacidad) {
                resultado = 35 <= capacidad
                        ? "Medio Estanque"
                        : "Suficiente";

            } else {
                resultado = "Insuficiente";
            }
        }

        System.out.println("Capacidad actual = " + resultado);
    }
}
