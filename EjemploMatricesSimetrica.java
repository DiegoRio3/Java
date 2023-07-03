public class EjemploMatricesSimetrica {
    public static void main(String[] args) {
        boolean simetria = true;
        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };
        salir: for(int i=0;i< matriz.length;i++){
            for(int j =0; j<i; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetria = false;
                    break salir;
                }
            }
        }
        if(simetria) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
