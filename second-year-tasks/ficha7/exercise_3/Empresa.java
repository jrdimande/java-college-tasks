public abstract class Empresa{
    protected String Nome;
    protected String Ender;
    protected String Cidade;
    protected int fone;

    public Empresa(){}

    public Empresa(String Nome, String Ender, String Cidade, int fone){
        this.Nome = Nome;
        this.Ender = Ender;
        this.Cidade = Cidade;
        this.fone = fone;
    }


}