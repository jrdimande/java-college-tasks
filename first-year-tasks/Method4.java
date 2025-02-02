public class Method4 {
    public static double maior(double num1, double num2, double num3){
        double[] vetor = {num1, num2, num3};
        double maior = vetor[0];

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }

        return maior;


    }

    public static void main(String[] args){
        double num = maior(2, 4,20);
        System.out.println(num);
    }
}
