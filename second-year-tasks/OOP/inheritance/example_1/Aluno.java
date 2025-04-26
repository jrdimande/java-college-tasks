package example_1;

public class Aluno extends Pessoa{
    private int mat;
    private String curso;

    public Aluno(String nome, int idade, String sexo, int mat, String curso){
        super(nome, idade, sexo);
        this.mat = mat;
        this.curso = curso;
    }
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }
}
