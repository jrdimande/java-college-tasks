import java.util.Scanner;

public class ProdutoPreco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] precos = new int[5];
        
        int quant = 0;


        for (int i = 1; i < 5; i++){
            System.out.print("Adicione produto "+ i + ": ");
            produtos[i] = sc.nextLine();
            
        }
        for (int i = 1; i < 6; i++){
            System.out.print("Coloca preço para o produto " + i + ":");
            precos[i] = sc.nextInt();

        }

        System.out.println("Produtos com preços no intervalo de 500 á 1000:");
        for (int i = 1; i < 6; i++){
            if (precos[i] < 500){
                quant += 1;
            }
            if (precos[i] >= 500 && precos[i] <= 1000){
                System.out.println(produtos[i].toUpperCase());
            }
        }
        
       
    }
}