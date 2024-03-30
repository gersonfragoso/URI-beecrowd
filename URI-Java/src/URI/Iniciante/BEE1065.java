package URI.Iniciante;

import java.util.Scanner;

public class BEE1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorPar = 0;
        int valorImpar = 0;
        int valorPositivo = 0;
        int valorNegativo = 0;
        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            if (numero < 0) {
                valorNegativo++;
            } else if (numero > 0) {
                valorPositivo++;
            }
            if (numero % 2 == 0) {
                valorPar++;
            } else {
                valorImpar++;
            }
        }
        System.out.println(valorPar + " valor(es) par(es)");
        System.out.println(valorImpar + " valor(es) impar(es)");
        System.out.println(valorPositivo + " valor(es) positivo(s)");
        System.out.println(valorNegativo + " valor(es) negativo(s)");
        sc.close();
    }
}
