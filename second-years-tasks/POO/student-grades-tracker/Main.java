import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("1 - Add a student.");
        System.out.println("2 - Assign grades to a student.");
        System.out.println("3 - Calculate and display avarage grade for a student.");
        System.out.println("4 - Display a report of all students and their average grades");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        School school = new School();

        menu();

        String option = "s";

        while ( option == "s" ){
            System.out.print("Choose an option: ");
            option = sc.nextLine();

            switch (option){
                case "1":
                    System.out.print("Enter student name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter student id: ");
                    int id = sc.nextInt();
                    Student student = new Student(name, id);
                    school.addStudent(student);
                    break;

                case  "2":
                    System.out.print("Enter student id: ");
                    id = sc.nextInt();
                    System.out.print("Enter add grade: ");
                    double grade = sc.nextDouble();

                    student = school.findStudent(id);
                    student.addGrade(grade);

            }
        }

        school.displayStudentsInfo();














    }
}