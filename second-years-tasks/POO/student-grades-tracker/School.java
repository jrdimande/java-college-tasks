import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    School(){
        this.students = new ArrayList<>();
    }

    // Method to add students to the list
    public void addStudent(Student student){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == student.getId()){
                System.out.println(0);
                return;
            }
        }
        students.add(student);
    }

    // Method to display each student info
    public void displayStudentsInfo(){
        for (int i = 0; i < students.size(); i++){
            students.get(i).displayDetails();
            System.out.println("============================================================================");

        }
    }

    // method to find student
    public void findStudent(int id){
        for (int i = 0; i < students.size(); i++){
            System.out.println(1);
            if (students.get(i).getId() == id){
                students.get(i).displayDetails();
            }else {
                System.out.println(0);
            }
        }
    }






}