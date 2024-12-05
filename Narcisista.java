import java.util.*;
public class Narcisista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int num = sc.nextInt();
        int aux = num;
        int sum = 0;
        int count = 0;

        while (num > 0){
            count++;
            num = num / 10;

        }

        num = aux;

        while (num > 0){
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }

        if (aux == sum){
            System.out.println("O número é narcisista");
        }else{
            System.out.println("O número não é narcisista");
        }


    }

}
