package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale locale = Locale.US;
        double media = 0;
        int aceita = 0;
        while (aceita < 2){
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10){
                media+=nota;
                aceita++;
            }else {
                System.out.println("nota invalida");
            }
        }
        sc.close();
        System.out.printf(locale,"media = %.2f\n",media/2);
    }
}
