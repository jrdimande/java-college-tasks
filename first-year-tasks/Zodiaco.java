import java.util.Scanner;
import java.util.ArrayList;

public class Zodiaco {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> signos = new ArrayList<>();
        signos.add("macaco");
        signos.add("galo");
        signos.add("cão");
        signos.add("porco");
        signos.add("rato");
        signos.add("boi");
        signos.add("tigre");
        signos.add("coelho");
        signos.add("dragão");
        signos.add("serpente");
        signos.add("cavalo");
        signos.add("carneiro");

        System.out.print("Insira teu ano de nascimento: ");
        int ano = sc.nextInt();

        //Determinando o signo Zodíaco
        int pos = ano % 12;

        System.out.println("O seu signo Zodíaco é " + signos.get(pos));















    }
}
