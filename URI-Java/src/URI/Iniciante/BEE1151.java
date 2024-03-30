package URI.Iniciante;

import java.util.Scanner;

public class BEE1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        for (int i = 2; i < N; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println();

        scanner.close();
    }
}
