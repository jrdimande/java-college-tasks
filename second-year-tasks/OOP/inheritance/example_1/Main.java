package example_1;

public class Main {
    public static void main(String[] args){
        Aluno p1 = new Aluno("Ben", 12, "M", 100, "LECC" );
        Professor p3 = new Professor("Keila", 10, "F", "portugues", 1200, "educacao", true);


        System.out.println(p1.toString());
        System.out.println(p3.toString());
        p1.fazerAniversario();
        System.out.println(p1.toString());

        p3.aumentoSal(1000);
        System.out.println(p3.verTrabalho());
        p3.mudaTrabalho();
        System.out.println(p3.verTrabalho());
    }
}
