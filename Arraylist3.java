import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();

        for (int i = 0 ; i < 11; i++){
            numbers.add(i);
        }
        int pares = 0, impares = 0;



        for (int i = 0; i < 11; i++){
            if (numbers.get(i) % 2 == 0){
                pares += 1;
            }else{
                impares += 1;
            }
        }
        System.out.println("A quantidade de números pares é: "+pares);
        System.out.println("A quantidade de números impares é: "+impares);
    }
}