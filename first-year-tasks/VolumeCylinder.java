import java.util.Scanner;

public class VolumeCylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduz o raio: ");
        double radius = sc.nextDouble();

        System.out.print("Introduz a Altura: ");
        double height = sc.nextDouble();

        double volume = 3.14 * Math.pow(radius, 2) * height;

        System.out.println("O volume do cilíndro é: "+volume);

        
    }
}