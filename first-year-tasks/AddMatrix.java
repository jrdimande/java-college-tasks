import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Criando os arrays bidimensionais
        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] soma = new int[3][3];

        //Preenchendo as matrizes
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite os valore para as posições ["+ i +"]["+ j+"]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite os valore para as posições ["+ i +"]["+ j+"]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }
        //Somando as matrizes
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite os valore para as posições ["+ i +"]["+ j+"]: ");
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();

        }




    }
}
