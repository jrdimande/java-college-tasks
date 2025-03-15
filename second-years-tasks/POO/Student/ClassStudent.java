import java.util.ArrayList;

public class ClassStudent {
    ArrayList<Student> students = new ArrayList<>();



    public void addStudent(Student student){
        students.add(student);

    }
    public void findStudent(int id){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == id){
                System.out.println("Estudante encontrado!");
            }else {
                System.out.println("Estudante nao encontrado");
            }
        }
    }

    public  void removeStudent(int id){
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).getId() == id){
                students.remove(students.get(i));
                System.out.println("Estudante removido!");
            }else {
                System.out.println("Estudante nao encontrado");
            }
        }

    }

    public void show(){
        if (students.isEmpty()){
            System.out.println("The list of studemts is empty");
        }else {
            for (int i = 0; i < students.size(); i++){
                System.out.println(students.get(i).getName());
            }

        }
    }
}
