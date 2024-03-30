package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BEE1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> lista = new ArrayList<>();
        int in = 0;
        int out = 0;
        for (int i = 0; i < num; i++) {
            int numero = sc.nextInt();
            lista.add(numero);
        }
        for (int i = 0; i < lista.size(); i++) {
            int numero = lista.get(i);
            if (10 <= numero && numero <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();

    }
}
