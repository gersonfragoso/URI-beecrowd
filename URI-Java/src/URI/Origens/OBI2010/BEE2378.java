package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2378 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        char estadoAtual = 'N';
        int maxPessoas = 0;
        for (int i = 0; i < N; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            maxPessoas -= S;
            maxPessoas += E;

            if (C < maxPessoas) {
                estadoAtual = 'S';
            }

        }
        System.out.println(estadoAtual);
        sc.close();

    }
}
