public abstract class Animal {
    private String som;

    public Animal(String som){
        this.som = som;
    }

    public String getSom(){
        return som;
    }

    public abstract void emitirSom();

}
