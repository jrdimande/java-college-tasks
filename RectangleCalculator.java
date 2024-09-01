import java.util.Scanner;

public class RectangleCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Area do rectângulo");
        System.out.println("2. Perímetro do rectângulo");
        System.out.println("3. Diagonal do rectânguo");

        int option = sc.nextInt();

        if (option == 1){
            System.out.print("Introduz o comprimento: ");
            double length = sc.nextDouble();

            System.out.print("Introduz a largura: ");
            double width = sc.nextDouble();

            double area = length * width;

            System.out.println("A área do rectãngulo é: "+ area);

        }
        else if (option == 2){
            System.out.print("Introduz o comprimento: ");
            double length = sc.nextDouble();

            System.out.print("Introduz a largura: ");
            double width = sc.nextDouble();

            double perimeter = 2 * (length + width);

            System.out.println("O perímetro do rectângulo é: " + perimeter);

        }
        else if (option == 3){
            System.out.print("Introduz o comprimento: ");
            double length = sc.nextDouble();

            System.out.print("Introduz a largura: ");
            double width = sc.nextDouble();

            double diagonal = Math.sqrt(length * length + width * width);

        }
        else{
            System.out.println("Opção inválida!");
        }



    }
}