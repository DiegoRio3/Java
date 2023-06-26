import java.util.Scanner;

public class ImprimirX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la X: ");
        int tamanioMatriz = s.nextInt();
        if(tamanioMatriz==0){
            System.err.println("ERROR");
            System.exit(0);
        }
        String[][] matriz = new String[tamanioMatriz][tamanioMatriz];
        for(int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length;j++) {
                if(i==j || j==matriz[i].length-1-i){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j]="_";
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
