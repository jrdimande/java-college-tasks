import java.util.ArrayList;
public class Student {
    private int id;
    private String name;
    private ArrayList<Double> grades;

    Student(String name, int id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getId(){
        return id;
    }

    // Method to add grades
    public void addGrade(double grade){
        if (grade >= 0){
            grades.add(grade);
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    // Method to calculate Avarage
    public double calculateAvarage(){
        double sum = 0;

        for (int i = 0; i < grades.size(); i++){
            sum = sum + grades.get(i);
        }
        double result =  sum / grades.size();

        return result;

    }

    // Method to display student info
    public void displayDetails(){
        calculateAvarage();
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Avarage: " + calculateAvarage());
    }

}