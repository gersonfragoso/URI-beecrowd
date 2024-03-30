package URI.Iniciante;

import java.util.Scanner;

public class BEE1557 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int entrada = sc.nextInt();
            if (entrada == 0) {
                break;
            }

            int[][] matriz = new int[entrada][entrada];

            if (entrada == 1) {
                System.out.println("1");
            } else {
                for (int i = 0; i < entrada; i++) {
                    for (int j = 0; j < entrada; j++) {
                        matriz[i][j] = (int) Math.pow(2, i + j);
                    }
                }

                int tamanhoMaximo = encontrarTamanhoMaximo(matriz);

                for (int i = 0; i < entrada; i++) {
                    for (int j = 0; j < entrada; j++) {
                        System.out.printf("%" + tamanhoMaximo + "d", matriz[i][j]);
                        if (j < entrada - 1) {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
        sc.close();
    }

    public static int encontrarTamanhoMaximo(int[][] matriz) {
        int tamanhoMaximo = Integer.MIN_VALUE;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                int tamanhoElemento = String.valueOf(elemento).length();
                tamanhoMaximo = Math.max(tamanhoMaximo, tamanhoElemento);
            }
        }
        return tamanhoMaximo;
    }
}
