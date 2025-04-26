package example_1;

public abstract class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando){
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;

    }

    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public boolean verTrabalho(){
        return this.trabalhando;
    }

}
