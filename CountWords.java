public class CountWords{
    public static void main(String[] args) {
        
        int count = 1;
        String words = "Hello world I love python";

        for (int i = 0; i < words.length(); i++){
            if (words.charAt(i) == ' '){
                count += 1;
            }
        System.out.println("The phrase has " + count + " words");
        }

    }
}