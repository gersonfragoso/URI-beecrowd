package URI.Iniciante;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class BEE1184 {
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
        int val =0;
        for (int j = 0; j < 12; j++) {
            for (int i = j+1; i < 12; i++) {
                valor += matriz[i][j];
                val++;
            }


        }

        if (s == 'M') {
            valor /= val;
            System.out.printf(Locale.US, "%.1f\n", valor);
        }

    }
}

