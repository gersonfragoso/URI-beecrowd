package URI.Iniciante;

import java.util.Scanner;

public class BEE1144 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int firstColumn = i;
            int secondColumn = i * i;
            int thirdColumn = i * i * i;

            System.out.println(firstColumn + " " + secondColumn + " " + thirdColumn);
            System.out.println(firstColumn + " " + (secondColumn + 1) + " " + (thirdColumn + 1));
        }

        scanner.close();
    }
}
