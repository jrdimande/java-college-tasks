public class Substring{
    public static void main(String[] args) {
        
        String language = "I love java";
        //                 012345678910

        System.out.println(language.length());

        String a = language.substring(0, 11);
        System.out.println(a);

        String b = language.substring(6, 11);
        System.out.println(b);
    }
}