import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la factura: ");
        String facturaStr = scanner.nextLine();
        System.out.println("Ingrese el precio del primer producto: ");
        Double precio1 = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto: ");
        Double precio2 = scanner.nextDouble();
        Double montoDouble = precio1 + precio2;
        Double impuesto = montoDouble * 0.19;
        System.out.println("La factura " + facturaStr + " tiene un total bruto de " + montoDouble + ", con un impuesto de "
        + impuesto + ", y el monto neto incluyendo impuesto es " + (montoDouble + impuesto));
    }
}
