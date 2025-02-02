import java.util.Random;

public class Method2 {

    // Method para criar array bidimensional
    public static int[][] criar_array(int x, int y){
        Random random = new Random();
        int[][] array = new int[x][y];


        int min = -20;
        int max = 20;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                int randomNum = random.nextInt((max - min) + 1) + min;
                array[i][j] = randomNum;
            }

        }
        return array;

    }
    // Criar array unidimensional a partir dos valores positivos do array bidimensional
    public static int[] criar_array_unidimensional(int[][] array){

        int n = array.length;
        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i][j] > 0){
                    count++;
                }
            }
        }

        int[] vetor = new int[count];
        int index = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (array[i][j] > 0){
                    vetor[index++] = array[i][j];
                }
            }
        }
        return vetor;

    }

    //Ordenar o array
    public static int[] ordenar(int[] array){
        int n = array.length;

        for(int i = 0; i < n; i++){
            for (int j = 0; j < n - i -1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }



    public static void main(String[] args){
        int[][] array = criar_array(3,3);
        int[] vetor = criar_array_unidimensional(array);

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");

        }

        ordenar(vetor);
        System.out.println();
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");

        }




    }



}
