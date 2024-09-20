import java.util.Scanner;

public class MediaArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva a quantidade de notas que será somada: ");
        int time = sc.nextInt();

        int Notas[] = new int[time];
        int soma = 0;

        for (int i = 0; i < Notas.length; i++){
            System.out.print("introduz a nota: ");
            Notas[i] = sc.nextInt();
        }
        
        for (int i = 0; i < Notas.length; i++){
            soma += Notas[i];
        }
        int media = soma / time;
        System.out.println("A m6édia das notas é: "+ media);


        
    }
}