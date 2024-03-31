package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2390 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] instante = new int[N];
        int tempTotal = 0;
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            instante[i] = T;
        }
        for (int i = 0; i < N - 1; i++) {
            int calcDiferenca = instante[i + 1] - instante[i];
            if (calcDiferenca <= 10) {
                tempTotal += calcDiferenca;
            } else {
                tempTotal += 10;
            }
        }
        tempTotal += 10;
        System.out.println(tempTotal);
        sc.close();

    }
}
