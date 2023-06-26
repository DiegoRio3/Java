import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un tercer numero: ");
        int num3 = scanner.nextInt();
        System.out.println("Ingrese un cuarto numero: ");
        int num4 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("Los números ingresados son: " + num1 + "  -  " + num2 + "  -  " + num3 + "  -  " + num4);
        System.out.println("El numero máximo es = " + max);
    }
}