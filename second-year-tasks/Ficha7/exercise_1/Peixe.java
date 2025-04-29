public class Peixe extends Animal implements Interface{
    private String nome;
    public Peixe(String locomocao, String alimentacao, String nome){
        super(0, locomocao, alimentacao);
        this.nome = nome;

    }

    @Override
    public void brinca(){
        System.out.println("O Peixe " + nome + " esta brincando");
    }

    @Override
    public void come(){
        System.out.println("O Peixe come " + alimentacao);
    }
}
