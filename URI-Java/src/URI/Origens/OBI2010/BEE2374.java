package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int pf = sc.nextInt();

        System.out.println(p - pf);
        sc.close();
    }
}
