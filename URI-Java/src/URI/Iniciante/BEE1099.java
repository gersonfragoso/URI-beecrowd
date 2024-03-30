package URI.Iniciante;

import java.util.Scanner;

public class BEE1099 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int somaImpares = 0;

            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }

            for (int j = X + 1; j < Y; j++) {
                if (j % 2 != 0) {
                    somaImpares += j;
                }
            }

            System.out.println(somaImpares);
        }

        scanner.close();
    }
}
