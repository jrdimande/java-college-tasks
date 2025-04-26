public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa(2025, "Kyara", 20);


        for (int i = 0; i < 10; i++){
            p.fazerAnos();
        }

        System.out.println("Nome: " + p.getNome() + " " + "Idade: "+p.getIdade() + " Quantidade de aniversarios:  " + p.getQt_aniversarios());
    }
}
