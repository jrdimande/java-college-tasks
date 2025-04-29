public class Restaurante extends Empresa implements Contrato{
    private String tipoComida;
    private double precoComida;

    public Restaurante(){}
    public Restaurante(String Nome, String Ender, String Cidade, int fone, String tipoComida, double precoComida){
        super(Nome, Ender, Cidade, fone);
        this.tipoComida = tipoComida;
        this.precoComida = precoComida;
    }
    @Override
    public String toString(){
        return "Nome: " + Nome + " Endereco: " + Ender + " Cidade: " + Cidade + " Fone: " + fone + " Tipo Comida: " + tipoComida + " Price: " + precoComida;
    }
}
