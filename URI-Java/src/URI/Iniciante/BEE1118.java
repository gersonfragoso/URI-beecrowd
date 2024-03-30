package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int aceita = 0;
        boolean continuar = true;
        while (continuar){

            while (aceita < 2){

                double nota = sc.nextDouble();
                if (nota >= 0 && nota <= 10){
                    media+=nota;
                    aceita++;
                }else {
                    System.out.println("nota invalida");
                }
                if (aceita == 2){
                    System.out.printf(Locale.US,"media = %.2f\n",media/2);

                }
            }

            System.out.println("novo calculo (1-sim 2-nao)");
            int cont = sc.nextInt();
            if(cont == 2){
                continuar=false;
            } else if (cont ==1) {
                continuar = true;
                aceita = 0;
                media = 0;
            }

        }
        sc.close();

    }
}
