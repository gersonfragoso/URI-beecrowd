package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BEE1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Float> lista = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            float nota1 = sc.nextFloat();
            float nota2 = sc.nextFloat();
            float nota3 = sc.nextFloat();
            float media = ((nota1 * 2) / 10) + ((nota2 * 3) / 10) + ((nota3 * 5) / 10);
            lista.add(media);
        }
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf(Locale.US, "%.1f\n", lista.get(i));
        }
        sc.close();
    }
}
