import java.util.Scanner;
import java.util.ArrayList;

public class STV {
    public static void resultado(ArrayList<Integer> votos, ArrayList<String> nomes) {
        for (int i = 0; i < votos.size(); i++) {
            for (int j = 0; j < votos.size() - i - 1; j++) {
                if (votos.get(j) < votos.get(j + 1)) {
                    int temp = votos.get(j);
                    votos.set(j, votos.get(j + 1));
                    votos.set(j + 1, temp);

                    String tempn = nomes.get(j);
                    nomes.set(j, nomes.get(j + 1));
                    nomes.set(j + 1, tempn);
                }
            }
        }

        for (int i = 0; i < votos.size(); i++) {
            System.out.printf("%s : %d votos%n", nomes.get(i), votos.get(i));
        }

        System.out.printf("O vencedor é: %s com %d votos.%n", nomes.get(0), votos.get(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> votes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.printf("Adicione o participante %d : ", i + 1);
            String name = sc.nextLine();
            names.add(name);
            votes.add(0);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s [%d]%n", names.get(i).toLowerCase(), i);
        }

        while (true) {
            System.out.print("Votar em: ");
            int votar = sc.nextInt();

            if (votar < 0) {
                break;
            } else if (votar >= 0 && votar < names.size()) {
                votes.set(votar, votes.get(votar) + 1);
                System.out.printf("Votou em : %s%n", names.get(votar));
            } else {
                System.out.println("Participante não encontrado!");
            }
        }

        resultado(votes, names);
    }
}
