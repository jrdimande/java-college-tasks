import java.util.Scanner;
import java.util.ArrayList;

public class Estatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        // Entrada de 9 números do usuário
        for (int i = 0; i < 9; i++) {
            System.out.print("Insira um número: ");
            double number = sc.nextDouble();
            numbers.add(number);
        }

        int len = numbers.size();

        // Ordenação por bolha
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    // Troca de valores
                    double temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }

        //Média
        double sum = 0;
        int posite = 0;
        int negative = 0;

        for (int i = 0; i < 9; i++){
            sum += numbers.get(i);
            if (numbers.get(i) > 0){
                posite++;
            }else {
                negative++;
            }


        }
        double avarage = sum / 10;

        // Exibindo os números ordenados
        System.out.println("Números ordenados: " + numbers);
        System.out.println("Média: "+avarage);
        System.out.println("O maior elemento: "+ numbers.get(len-1));
        System.out.println("O menor elemnto: "+ numbers.get(0));
        System.out.println("Quantidade de números positivos: " + posite);
        System.out.println("Quantidade de números negativos: " + negative);

    }
}
