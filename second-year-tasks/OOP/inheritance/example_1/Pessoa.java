package example_1;

public  abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    public void fazerAniversario(){
        this.idade ++;
    }

    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " Sexo: " + sexo;
    }
}

