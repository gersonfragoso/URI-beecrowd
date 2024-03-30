package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> lista = new ArrayList<>();
        int valorPos = 0;
        float valorPosTotal = 0;
        for (int i = 0; i < 6; i++) {
            Float numero = sc.nextFloat();
            lista.add(numero);
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 0) {
                valorPos += 1;
                valorPosTotal += lista.get(i);
            }
        }
        System.out.println(valorPos + " valores positivos");
        System.out.printf(Locale.US, "%.1f\n", valorPosTotal / valorPos);
        sc.close();

    }
}
