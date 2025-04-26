package example_1;

public class Main {
    public static void main(String[] args) {
        Aluno p1 = new Aluno("Ben", 12, "M", 100, "LECC");
        Professor p2 = new Professor("Keila", 10, "F", "portugues", 1200, "educacao", true);

        // Mostrar p1
        System.out.println(p1.toString());
        // Fazer aniversario
        p1.fazerAniversario();
        System.out.println(p1.toString());

        // Mostrar p2
        System.out.println(p2.toString());
        p2.aumentoSal(24000);
        p2.mudaTrabalho();
        p2.fazerAniversario();
        System.out.println(p2.toString());





    }
}
