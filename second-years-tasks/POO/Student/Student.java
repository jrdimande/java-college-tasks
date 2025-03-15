public class Student {
    private int id;
    private String name;
    private String level;
    private int age;

    Student(int id,String name, String level, int age){
        this.id = id;
        this.name = name;
        this.level = level;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;

    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String getLevel(){
        return level;
    }
}
