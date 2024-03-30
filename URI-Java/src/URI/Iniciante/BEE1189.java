package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1189 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        char s = sc.next().charAt(0);
        double[][] matriz = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        double valor = 0;
        int valQuant = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                valor += matriz[i][j];
                valQuant++;

            }
        }

        for (int i = 6; i <= 10; i++) {
            for (int j = 0; j < 11 - i; j++) {
                valor += matriz[i][j];
                valQuant++;
            }
        }

        if (s == 'M') {
            valor /= valQuant;
        }

        System.out.printf(Locale.US, "%.1f\n", valor);
    }
}
