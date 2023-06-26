import java.util.Scanner;

public class SistemaEstanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual del estanque: ");
        double capacidad = scanner.nextDouble();
        String resultado = "";

        if (capacidad >= 40) {
            if (capacidad>= 70){
                resultado = "Estanque Lleno";
            } else {
                resultado = capacidad >= 60 ? "Estanque casi lleno" : "Estanque 3/4";
            }
        } else {
            if (capacidad >= 20) {
                resultado = capacidad >= 35 ? "Medio Estanque" : "Suficiente";
            } else {
                resultado = "Insuficiente";
            }
        }
        System.out.println("Capacidad actual = " + resultado);
    }
}


  /*  Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida
      la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

        La medida o capacidad actual del estanque puede ser en tipo double,
        para una mejor precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente        */
