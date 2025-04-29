public abstract class Animal {
    protected int pernas;
    protected String locomocao;
    protected String alimentacao;

    public Animal(int pernas, String locomocao, String alimentacao){
        this.pernas = pernas;
        this.locomocao = locomocao;
        this.alimentacao = alimentacao;
    }

    public void caminha(){
        System.out.println("O Animal " + locomocao);
    }
    public void come(){
        System.out.println("O animal come " + alimentacao);
    }
}
