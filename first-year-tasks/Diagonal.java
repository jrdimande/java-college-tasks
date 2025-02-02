public class Diagonal {
    public static void main(String[] args){
        int[][] matriz = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        // Imprimir diagnoal principal
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");

        }
        System.out.println();

        //imprimir diagonal secundária
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][matriz.length - i - 1] + " " );
        }
    }
}
