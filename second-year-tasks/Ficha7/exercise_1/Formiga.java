public class Formiga extends Animal{
    public Formiga(int pernas, String locomocao, String alimentacao){
        super(pernas, locomocao, alimentacao);
    }

    @Override
    public void come(){
        System.out.println("A formiga come " + alimentacao);
    }
}
