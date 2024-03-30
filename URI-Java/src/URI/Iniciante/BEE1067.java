package URI.Iniciante;

import java.util.Scanner;

public class BEE1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 0; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
        }
        sc.close();
    }
}
