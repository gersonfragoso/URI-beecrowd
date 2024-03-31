package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int km = 0;
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int V = sc.nextInt();
            km += T * V;

        }
        System.out.println(km);
        sc.close();

    }
}
