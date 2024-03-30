package URI.Iniciante;

import java.util.Scanner;

public class BEE1160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int PA = scanner.nextInt();
            int PB = scanner.nextInt();
            double G1 = scanner.nextDouble();
            double G2 = scanner.nextDouble();

            int anos = 0;
            while (PA <= PB) {
                PA += (PA * G1 / 100);
                PB += (PB * G2 / 100);
                anos++;

                if (anos > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }

            if (anos <= 100) {
                System.out.println(anos + " anos.");
            }
        }

        scanner.close();
    }
}
