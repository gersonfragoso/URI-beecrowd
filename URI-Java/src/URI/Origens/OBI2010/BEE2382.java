package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int P = sc.nextInt();
        int R = sc.nextInt();
        double supr = (Math.pow(L, 2) + Math.pow(A, 2) + Math.pow(P, 2));
        double supr1 = Math.sqrt(supr);

        if (supr1 <= R * 2) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        sc.close();

    }
}
