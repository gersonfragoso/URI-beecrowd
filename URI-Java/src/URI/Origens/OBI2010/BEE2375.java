package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int a = sc.nextInt();
        int l = sc.nextInt();
        int p = sc.nextInt();

        if (a < d || l < d || p < d) {
            System.out.println("N");
        } else {
            System.out.println("S");


        }
        sc.close();
    }
}
