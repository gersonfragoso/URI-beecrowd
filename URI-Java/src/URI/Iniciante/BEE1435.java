package URI.Iniciante;

import java.util.Scanner;

public class BEE1435 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        while ((N = scanner.nextInt()) != 0) {
            int[][] matriz = construirMatriz(N);
            imprimirMatriz(matriz);
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] construirMatriz(int ordem) {
        int[][] matriz = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = Math.min(Math.min(i, j), Math.min(ordem - 1 - i, ordem - 1 - j)) + 1;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%3d", matriz[i][j]);
                if (j < matriz[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
