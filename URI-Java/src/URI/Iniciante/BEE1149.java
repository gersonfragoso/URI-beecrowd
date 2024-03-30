package URI.Iniciante;

import java.util.Scanner;

public class BEE1149 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int N = scanner.nextInt();

        while (N <= 0) {
            N = scanner.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < N; i++) {
            soma += A + i;
        }

        System.out.println(soma);

        scanner.close();
    }


}
