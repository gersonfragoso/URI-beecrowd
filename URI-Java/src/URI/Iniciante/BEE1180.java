package URI.Iniciante;

import java.util.Scanner;

    public class BEE1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] vetor = new int[num];
        for (int i = 0; i < num; i++) {
            int x = sc.nextInt();
            vetor[i] = x;
        }

        int menor = vetor[0];
        int posicao = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);
    }
}
