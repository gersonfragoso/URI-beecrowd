package URI.Iniciante;

import java.util.Scanner;

public class BEE1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            int[] matriz = new int[N];
            for (int i = 0; i < N; i++) {
                matriz[i] = sc.nextInt();
            }
            int nvl = matriz[0];
            for (int i = 1; i < matriz.length; i++) {
                if (matriz[i] > nvl) {
                    nvl = matriz[i];
                }
            }
            if (nvl < 10) {
                System.out.println(1);
            } else if (nvl < 20) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
        sc.close();
    }
}
