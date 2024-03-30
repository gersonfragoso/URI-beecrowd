package URI.EstruturaEBibliotecas;

import java.util.Scanner;

public class BEE1022 {
    static int operacao1 = 0;
    static int operacao2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < E; i++) {
            String I = sc.nextLine();
            String[] tokens = I.split("\\s+");
            int n1 = Integer.parseInt(tokens[0]);
            int d1 = Integer.parseInt(tokens[2]);
            char tipoOp = tokens[3].charAt(0);
            int n2 = Integer.parseInt(tokens[4]);
            int d2 = Integer.parseInt(tokens[6]);

            int numerador = 0, denominador = 0;

            switch (tipoOp) {
                case '+':
                    numerador = n1 * d2 + n2 * d1;
                    denominador = d1 * d2;
                    break;
                case '-':
                    numerador = n1 * d2 - n2 * d1;
                    denominador = d1 * d2;
                    break;
                case '*':
                    numerador = n1 * n2;
                    denominador = d1 * d2;
                    break;
                case '/':
                    numerador = n1 * d2;
                    denominador = n2 * d1;
                    break;
            }

            // Simplificar a fração
            int gcd = gcd(Math.abs(numerador), Math.abs(denominador));
            operacao1 = numerador / gcd;
            operacao2 = denominador / gcd;

            System.out.println(numerador + "/" + denominador + " = " + operacao1 + "/" + operacao2);
        }
        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
