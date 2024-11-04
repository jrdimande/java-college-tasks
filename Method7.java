import java.util.Scanner;

public class Method7 {
    //Multiplicar as matrizes
    public static void multiplicar(int[][] array1, int[][] array2){
        int n = array1[0].length;
        int m = array1[1].length;

        int[][] new_array = new int[n][m];

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                new_array[i][j]= array1[i][j] * array2[i][j];
            }
        }

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                System.out.print(new_array[i][j] + " ");
            }

            System.out.println();
        }



    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de linhas  : ");
        int tipo = sc.nextInt();

        int[][] array1 = new int[tipo][tipo];
        int[][] array2 = new int[tipo][tipo];

        System.out.println("Preencha a matriz 1");

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                System.out.printf("Preencha a posiça %d %d: ", i, j);
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Preencha a matriz 2");
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1.length; j++){
                System.out.printf("Preencha a posiça %d %d: ", i, j);
                array2[i][j] = sc.nextInt();
            }
        }

        multiplicar(array1, array2);




    }
}
