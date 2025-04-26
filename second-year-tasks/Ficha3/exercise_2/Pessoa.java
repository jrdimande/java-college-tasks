public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private int aniversarios;

    public Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAnos(){
        this.idade = idade + 1;
        this.aniversarios = aniversarios + 1;
    }

    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Aniversarios: " + aniversarios;
    }
}
