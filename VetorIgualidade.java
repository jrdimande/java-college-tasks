public class VetorIgualidade {
    public static void main(String[] args){
        int[] array1 = {1, 5, 3};
        int[] array2 = {1, 3, 6};
        int counter = 0;

        for (int i = 0; i < array1.length; i++){
            if (array1[i] == array2[i]){

            }else {
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("Os vetores são iguais");
        }else {
            System.out.printf("Os vetortes tem %d valores diferentes", counter);
        }
    }
}
