package URI.Iniciante;

import java.util.Scanner;

public class BEE1181 {
    public static void main(String[] args) {
        double[][] matriz = new double[12][12];
        Scanner scanner = new Scanner(System.in);

        int linha = scanner.nextInt();
        char operacao = scanner.next().charAt(0);

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Realizando a operação
        double resultado = 0;
        for (int j = 0; j < 12; j++) {
            resultado += matriz[linha][j];
        }

        // Se for média dividir pelo número de elementos
        if (operacao == 'M') {
            resultado /= 12;
        }

        System.out.printf("%.1f\n", resultado);

        scanner.close();
    }
}
