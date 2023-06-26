import javax.swing.*;

public class SentenciaFor {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            if(i%2==0) {
                continue;
            }
            System.out.println("i= " + i);
        }
        System.out.println();

        // SentenciaForArreglo
        String[] nombres = {"andres", "diego", "tiago", "dylan"};
        int count = nombres.length;
        for(int i = 0; i < count ; i++) {
            System.out.println(i + " " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre a buscar: ");
        System.out.println("Buscar: " + buscar);
        boolean encontrado = false;
        for(int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
        }
        if(encontrado) {
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema");
        }
    }
}
