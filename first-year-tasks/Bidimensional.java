import java.util.Scanner;

public class Bidimensional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] array = new int[3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Digite os valore para as posições ["+ i +"]["+ j+"]: ");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++ ){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
