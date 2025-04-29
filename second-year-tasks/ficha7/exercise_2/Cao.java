public class Cao extends Animal{
    public Cao(String som){
        super(som);
    }

    @Override
    public void emitirSom(){
        System.out.println("O cao faz: " + getSom());

    }
}

