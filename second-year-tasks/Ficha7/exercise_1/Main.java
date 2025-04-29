public class Main {
    public static void main(String[] args){
        Formiga f = new Formiga(4, "anda", "pipoca");
        Cachorro c = new Cachorro(4, "anda","carne", "Bob" );
        Peixe p = new Peixe("nada", "plantas", "peixe");

        f.caminha();
        f.come();

        System.out.println();

        c.caminha();
        c.come();
        c.brinca();

        System.out.println();

        p.caminha();
        p.come();
        p.brinca();
    }
}
