import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ClassStudent c1 = new ClassStudent();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++){
            System.out.println("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // Consome o caractere de nova linha

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter level: ");
            String level = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();

            Student s1 = new Student(id, name, level, age);
            c1.addStudent(s1);

            System.out.println("========================================================================================");

        }

        c1.removeStudent(0);
        c1.show();

    }
}
