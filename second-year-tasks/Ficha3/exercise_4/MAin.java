public class MAin {
    public static void main(String[] args){
        Conta c = new Conta("Keila", 19502025, "001", "2025/06/12");

        c.depositar(10000);
        System.out.println(c.calcularRendimento());
        c.sacar(10000000);
    }
}
