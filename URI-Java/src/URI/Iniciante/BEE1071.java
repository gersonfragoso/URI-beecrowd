package URI.Iniciante;

import java.util.Scanner;

public class BEE1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numero1 = sc.nextInt();
        int impSoma = 0;
        for (int i = numero1 + 1; i < numero; i++) {

            if (i % 2 != 0) {
                impSoma += i;
            }
        }

        System.out.println(impSoma);
        sc.close();

    }
}
