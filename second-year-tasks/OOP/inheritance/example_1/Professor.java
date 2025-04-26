package example_1;

public class Professor extends Funcionario{
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario, String setor, boolean trabalhando){
        super(nome, idade, sexo, setor, trabalhando);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void aumentoSal(double sal){
        this.salario = salario + sal;
    }
}
