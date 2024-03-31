package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int coposQuebrado = 0;
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            int C = sc.nextInt();
            if (L > C) {
                coposQuebrado += C;
            }
        }
        System.out.println(coposQuebrado);
        sc.close();
    }
}
