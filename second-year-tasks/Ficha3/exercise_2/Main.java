public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa(2025, "summer walker", 21);

        for (int i = 0; i < 10; i++){
            p.fazerAnos();
        }

        System.out.println(p.toString());
    }
}
