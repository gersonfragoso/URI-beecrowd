package URI.Iniciante;

import java.util.Scanner;

public class BEE1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z;

        do {
            z = sc.nextInt();
        } while (z <= x);

        int soma = x;
        int quantidade = 1;

        while (soma <= z) {
            soma += x + quantidade;
            quantidade++;
        }

        System.out.println(quantidade);
        sc.close();
    }
}
