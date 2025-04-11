public class Car {
    private String model;
    private String brand;
    private int year;
    private int ID;

    Car(String model, String brand, int ID, int year){
        this.model = model;
        this.brand = brand;
        this.ID = ID;
        this.year = year;
    }

    public void display(){
        System.out.println(model.toUpperCase());
        System.out.println(year);
        System.out.println(brand.toUpperCase());
    }

}
