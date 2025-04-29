public class Cachorro extends Animal implements Interface{
    private String nome;

    public Cachorro(int pernas, String locomocao, String alimentacao, String nome){
        super(pernas, locomocao, alimentacao);
        this.nome = nome;
    }

    @Override
    public void brinca(){
        System.out.println("O Cachorro " + nome + " esta brincando");
    }

    @Override
    public void come(){
        System.out.println("O Cachorro come " + alimentacao);
    }
}
