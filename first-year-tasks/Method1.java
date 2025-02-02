import java.util.Scanner;

public class Method1 {

    // Criar um array unidimensional
    public static int[] criar_vetor(int tamanho){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length ; i++){
            System.out.printf("Preencha a posição [%d]:", i );
            vetor[i] = sc.nextInt();


        }
        return vetor;

    }
    // Imprimir o array unidimensional
    public static void imprimir_array(int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n; i++){
            System.out.println(vetor[i]);
        }
    }

    // Pesquisar elemento no vetor
    public static void pesquisar_elemento(int numero, int[] vetor){
        int n = vetor.length;

        for (int i = 0; i < n; i++){
            if (numero == vetor[i]){
                System.out.printf("Elemento %d encontrado na posição %d", numero, i);

            }
        }
    }
    public static void media(int[] vetor){
        int n = vetor.length;
        int soma = 0;

        for (int i = 0; i < n; i++ ){
            soma += vetor[i];
        }

        double med = soma / n;
        System.out.println("A média do array é: " + med);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduz o tamanho do array: ");
        int tamanho = sc.nextInt();


        int[] array = criar_vetor(tamanho);
        imprimir_array(array);
        media(array);



    }

}
