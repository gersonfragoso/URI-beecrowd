package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1188 {
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

        for (int i = 11; i > 6; i--) {
            for (int j = 12-i; j <i ; j++) {
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
