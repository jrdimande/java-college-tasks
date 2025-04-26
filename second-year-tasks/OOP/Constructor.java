public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(int year, String name){
        this.modelYear = year;
        this.modelName = name;
    }

    public static void main(String[] args){
        Constructor myCar = new Constructor(1965, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
