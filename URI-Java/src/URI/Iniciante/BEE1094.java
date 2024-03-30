package URI.Iniciante;

import java.util.Scanner;

public class BEE1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int coelho = 0;
        int sapo = 0;
        int rato = 0;

        for (int i = 0; i < num; i++) {
            String entrada = sc.nextLine();
            if (entrada.matches("\\d+\\s+[A-Za-z]")) {
                String[] partes = entrada.split("\\s+");
                int nume = Integer.parseInt(partes[0]);
                char ani = partes[1].charAt(0);
                if (ani == 'C') {
                    coelho += nume;
                } else if (ani == 'R') {
                    rato += nume;
                } else if (ani == 'S') {
                    sapo += nume;
                }
            }
        }
        int total = coelho + rato + sapo;
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.println("Percentual de coelhos: " + ((coelho * 100) / total) + " %");
        System.out.println("Percentual de ratos: " + ((rato * 100) / rato) + " %");
        System.out.println("Percentual de sapos: " + ((sapo * 100) / total) + " %");
        sc.close();
    }
}
