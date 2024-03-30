package URI.Iniciante;

import java.time.Month;
import java.util.Scanner;

public class BEE1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        Month data = Month.of(mes);
        String nomeMes = formatarNomeMes(data.toString().toLowerCase());
        System.out.println(nomeMes);
        sc.close();
    }

    private static String formatarNomeMes(String nomeMes) {
        return nomeMes.substring(0, 1).toUpperCase() + nomeMes.substring(1);
    }

}