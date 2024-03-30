package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BEE1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int maiorNumero = 0;
        for (int i = 1; i <= 100; i++) {
            int numero = sc.nextInt();
            lista.add(numero);
        }
        for (int i = 0; i < lista.size(); i++) {
            if (maiorNumero < lista.get(i)) {
                maiorNumero = lista.get(i);
            }
        }
        System.out.println(maiorNumero);
        System.out.println(lista.indexOf(maiorNumero) + 1);
        sc.close();
    }
}
