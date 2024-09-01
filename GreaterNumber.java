import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número:");
        int num1 = sc.nextInt();

        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Terceiro número: ");
        int num3 = sc.nextInt();

        int maior = 0;
        int menor = 0;







        // verifcar o maior e menor número e colocar em orem decrescente
        if (num1 > num2 && num2 > num3){
            System.out.println(num1 +" " + num2 +" "+ num3);

            maior = num1;
            menor = num3;
        }
        else if (num1 > num3 && num3 > num2){
            System.out.println(num1 +" " + num3 +" "+ num2);

            maior = num1;
            menor = num2;

        }

        else if (num2 > num1 && num1 > num3){
            System.out.println(num2 +" " + num1 +" "+ num3);

            maior = num2;
            menor =num3;

        }

        else if (num2 > num3 && num3 > num1){
            System.out.println(num2 +" " + num3 +" "+ num1);

            maior = num2;
            menor =num1;

            
        }

        else if (num3 > num1 && num1 > num2){
            System.out.println(num3 +" " + num1 +" "+ num2);

            maior = num3;
            menor =num2;
        }

        else if (num3 > num2 && num2 > num1){
            System.out.println(num3 +" " + num2+" "+ num1);

            maior = num3;
            menor =num1;
        }

        System.out.println("O maior número é: "+maior);
        System.out.println("O menor número é: "+menor);


        }

        }

    
