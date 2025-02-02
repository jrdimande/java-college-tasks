public class Pascal {
    public static void main(String[] args) {
        int n = 6; // Número de linhas do Triângulo de Pascal
        int[][] pascal = new int[n][n];

        // Gerar o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            pascal[i][0] = 1; // Início de cada linha é 1
            for (int j = 1; j <= i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Exibir o Triângulo de Pascal
        for (int i = 0; i < n; i++) {
            // Espaços para alinhar o triângulo
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            // Números da linha
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
