package URI.Origens.OBI2010;

import java.util.Scanner;

// NAO RESOLVIDO;
public class BEE2371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrizI = sc.nextInt();
        int matrizJ = sc.nextInt();
        char[][] tabuleiro = new char[matrizI][matrizJ];
        sc.nextLine();

        for (int i = 0; i < matrizI; i++) {
            String linha = sc.nextLine();
            for (int j = 0; j < matrizJ; j++) {
                tabuleiro[i][j] = linha.charAt(j);
            }
        }

        int numJogadas = sc.nextInt();
        int acertos = 0;
        for (int i = 0; i < numJogadas; i++) {
            int posI = sc.nextInt() - 1; // Subtrair 1 para ajustar ao índice da matriz
            int posJ = sc.nextInt() - 1; // Subtrair 1 para ajustar ao índice da matriz
            if (posI >= 0 && posI < matrizI && posJ >= 0 && posJ < matrizJ) {
                if (tabuleiro[posI][posJ] == '#') {
                    acertos++;
                    destruirNavio(tabuleiro, posI, posJ); // Marca to,do o navio como destruído
                }
            }
        }

        System.out.println(acertos);
    }

    // Função para destruir o navio considerando sua extensão
    public static void destruirNavio(char[][] tabuleiro, int posI, int posJ) {
        int matrizI = tabuleiro.length;
        int matrizJ = tabuleiro[0].length;


        if (posI == 0 && posJ == 0 || posJ == 0 && posI > 0 || posI == 0 && posJ > 0) {
            if (posI == 0 && posJ == 0) {

            }
        }

        tabuleiro[posI][posJ] = '.';

        destruirNavio(tabuleiro, posI + 1, posJ);
        destruirNavio(tabuleiro, posI - 1, posJ);
        destruirNavio(tabuleiro, posI, posJ + 1);
        destruirNavio(tabuleiro, posI, posJ - 1);
    }

}
