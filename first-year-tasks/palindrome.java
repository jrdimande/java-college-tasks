public class palindrome{
    public static void main(String[] args) {
        
        String name = "mom";
        String reversed_name = "";

        for(int i = name.length() - 1; i >= 0; i--){
            reversed_name += name.charAt(i);

        }
        System.out.println(reversed_name);

        if (name.equals(reversed_name)){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}