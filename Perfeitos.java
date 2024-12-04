import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Perfeitos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Introduz o quantidade de números: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++){
            System.out.printf("Preencha a posição[%d]: ", i);
            int number = sc.nextInt();
            numbers.add(number);
        }

        for (int i = 0; i < quantidade; i++){
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();

        for (int num : numbers){
            int sum  = 0;

            for (int i = 1; i < num - 1 ; i++){
                if (num % i == 0){
                    sum += i;
                }

            }

            if (num == sum){
                System.out.println(num + " é perfeito");
            }else{
                System.out.println(num + " não e perfeito");
            }
        }



    }
}
