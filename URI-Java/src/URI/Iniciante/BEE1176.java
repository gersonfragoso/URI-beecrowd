package URI.Iniciante;

import java.util.Scanner;

public class BEE1176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // número de casos de teste

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // N-ésimo termo da série de Fibonacci
            long fibN = fibonacci(N); // Calcula o N-ésimo termo da série de Fibonacci

            System.out.println("Fib(" + N + ") = " + fibN);
        }

        scanner.close();
    }

    // Método para calcular o N-ésimo termo da série de Fibonacci
    public static long fibonacci(int N) {
        if (N <= 1) {
            return N;
        }

        long a = 0;
        long b = 1;

        for (int i = 2; i <= N; i++) {
            long fibNext = a + b;
            a = b;
            b = fibNext;
        }

        return b;
    }
}


