import java.util.Scanner;

public class ImprimirUnaSilla {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la silla: ");
        int tamanioMatriz = s.nextInt();
        if(tamanioMatriz==0){
            System.err.println("ERROR");
            System.exit(1);
        }
        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];
        for(int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length;j++) {
                if(j==0 || i== matriz.length/2 || (j== matriz[i].length-1 && i>=matriz.length/2)){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}