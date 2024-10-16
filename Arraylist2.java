import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2{
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i <= 10; i++){
            System.out.print("Adicionar item: ");
            String name = input.nextLine();
            cars.add(name);
        }
        System.out.println("Os carros presentes na lista são:");
        for(int i = 0; i <= 10; i++){
            System.out.println(cars.get(i).toUpperCase());

        }
    }
}