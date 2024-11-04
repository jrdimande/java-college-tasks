public class Method3 {
    public static void isPalindromo(String[] palavra){

        String word = "palavra";
        String new_word = "";

        for (int i = word.length() - 1; i >= 0; i--){
            new_word += word.charAt(i);
        }

        if (word.equals(new_word)){
            System.out.println("A Palavra é um palindromo");
        }else {
            System.out.println(" A palavra Não é um palindromo");
        }

    }
}
