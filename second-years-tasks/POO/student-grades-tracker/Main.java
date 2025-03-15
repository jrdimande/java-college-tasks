public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Teddy",0);
        Student s2 = new Student("Denzel", 1);
        Student s3 = new Student("Kayron", 2);
        School c1 = new School();

        s1.addGrade(-10);
        s1.addGrade(18);
        s1.addGrade(20);
        s1.addGrade(12);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.displayStudentsInfo();












    }
}