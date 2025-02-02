import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1{
    public static void main(String[] args) {
        ArrayList <String> city_name = new ArrayList<>();

        city_name.add("maputo");
        city_name.add("nampula");
        city_name.add("cabo delgado");
        
        System.out.println(city_name.get(0).toUpperCase());
        
    }
}