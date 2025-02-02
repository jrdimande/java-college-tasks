public class Method5 {

    // Trocar números pares por 1 e impares por -1
    public static int[] trocar(int[] array){
        int n = array.length;

        for (int i = 0; i < n; i++){
            if (array[i] % 2 == 0){
                array[i] = 1;
            }else {
                array[i] = -1;
            }
        }

        return array;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6};

        trocar(array);

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
