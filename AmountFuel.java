import java.util.Scanner;

public class AmountFuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tempo da viagem em horas:");
        int time = sc.nextInt();

        System.out.print("Velocidade média em m/s: ");
        int speed = sc.nextInt();
        
        int distance = time * speed;
        int liters = distance / 12;
 
        System.out.println("Para viajar " + distance + " km/h" + "em " + time + "hrs" + " é necessário " + liters +" litros de combustíve");
        

        
    }
}