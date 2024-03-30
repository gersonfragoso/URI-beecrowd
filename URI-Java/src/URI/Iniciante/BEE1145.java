package URI.Iniciante;

import java.util.Scanner;

public class BEE1145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            count++;
            if (count == X) {
                System.out.println();
                count = 0;
            } else if (i != Y) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}
