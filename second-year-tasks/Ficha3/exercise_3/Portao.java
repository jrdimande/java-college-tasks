public class Portao {
    private boolean status = false;

    public void abrir(){
        this.status = true;
    }
    public void fechar(){
        this.status = false;
    }

    public void estaAberto(){
        if (status == true){
            System.out.println("Esta aberto.");
        }else {
            System.out.println("Esta fechado.");
        }
    }
}
