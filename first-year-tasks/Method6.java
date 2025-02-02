public class Method6 {
    public static void count(int[] array, int num){
        int n = array.length;
        int counter = 0;

        for (int i = 0; i < n; i++){
            if (array[i] == num){
                counter++;
            }
        }

        System.out.printf("O número %d foi encontrado %d vezes", num, counter);
    }

    public static void main(String[] args){
        int[] array = {1, 2, 2, 2, 3, 4, 5};
        count(array, 0);

    }
}
