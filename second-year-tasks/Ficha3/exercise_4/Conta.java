public class Conta {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo = 0;
    private String data_abertura;

    public Conta(String nomeTitular, int numero, String agencia, String data_abertura){
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.data_abertura = data_abertura;
    }

    // Metodo para saque
    public void sacar(int valor){
        if (saldo >= valor){
            this.saldo = saldo - valor;

        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Metodo para deposito
    public void depositar(int valor){
        if (valor > 0){
            this.saldo = saldo + valor;

        }else {
            System.out.println("Valor Invalido!");
        }
    }

    public double calcularRendimento(){
        return saldo * 0.10;
    }


}
