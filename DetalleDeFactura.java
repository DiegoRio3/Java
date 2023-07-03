/*
Assignment: Detalle de la factura
Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner
La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura,
se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

    Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
    Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
    Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto),
el impuesto y el monto total neto incluyendo impuesto.
Por ejemplo, el resultado podría ser algo así:
La factura producto de oficina tiene un total bruto de 134.78,
con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
 */

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
