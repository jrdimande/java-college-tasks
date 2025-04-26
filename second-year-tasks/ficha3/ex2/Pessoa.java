public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private int qt_aniversarios;

    // Usando constructors
    Pessoa(){

    }
    Pessoa(int id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Usando metodos getters and setters
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }

    // Metodo para incrementar a idade e contar o nr de aniversarios
    public void fazerAnos(){
        this.qt_aniversarios = qt_aniversarios + 1;
        this.idade = idade + 1;
    }

    public int getQt_aniversarios(){
        return qt_aniversarios;
    }
}
