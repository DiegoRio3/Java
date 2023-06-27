/*
Assignment: Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos
usando la clase JOptionPane y método showInputDialog(). Calcular e Imprimir el nombre de la persona que tenga
el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
y con el indice cero accedemos al nombre de la persona. Restricción no usar loops en el desarrollo de la tarea.
Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */
import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido: ");
        String nombreCompleto2 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido: ");
        String nombreCompleto3 = JOptionPane.showInputDialog(null,"Ingrese nombre y apellido: ");
        String[] nombre1 = nombreCompleto1.split(" ");
        String[] nombre2 = nombreCompleto2.split(" ");
        String[] nombre3 = nombreCompleto3.split(" ");
        String nombreMasLargo = nombre1[0].length() > nombre2[0].length() ? nombreCompleto1 : nombreCompleto2;
        String[] nombreMasLargo2 = nombreMasLargo.split(" ");
        nombreMasLargo = nombreMasLargo2[0].length() > nombre3[0].length() ? nombreMasLargo : nombreCompleto3;
        System.out.println(nombreMasLargo + " tiene el nombre mas largo.");
    }
}