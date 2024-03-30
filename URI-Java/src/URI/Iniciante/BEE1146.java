package URI.Iniciante;

import java.util.Scanner;

public class BEE1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X;

        while ((X = sc.nextInt()) != 0) {
            for (int i = 1; i <= X; i++) {
                if (i == X) {
                    System.out.print(i);
                } else {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
