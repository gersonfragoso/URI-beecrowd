package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1177 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer>N = new ArrayList<>();
        int valor = 0;
        for (int i = 0; i < 1000; i++) {
            N.add(valor);
            valor++;
            if (valor == T) {
                valor = 0;
            }
        }

        for (int i = 0; i < 1000; i++) {
            System.out.println("N[" + i + "] = " + N.get(i));
        }
        sc.close();
    }
}
