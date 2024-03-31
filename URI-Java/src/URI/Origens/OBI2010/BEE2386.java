package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2386 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int N = sc.nextInt();
        int estrelaV = 0;
        for (int i = 0; i < N; i++) {
            int F = sc.nextInt();
            int visivel = F * A;
            if (visivel >= 40000000) {
                estrelaV += 1;
            }
        }
        System.out.println(estrelaV);
        sc.close();

    }
}
