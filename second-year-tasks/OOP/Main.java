public class Main {
    int x = 5;

    public static void main(String[] args){
        Main myObj = new Main();
        Main myObj1 = new Main();
        System.out.println("Original: " + myObj.x);

        // Modify attribute
        myObj.x = 40;
        System.out.println("Modified: " + myObj.x);

        // Operations
        System.out.println("Result: " + myObj.x + myObj1.x);
    }
}
