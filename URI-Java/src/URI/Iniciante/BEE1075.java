package URI.Iniciante;

import java.util.Scanner;

public class BEE1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= 10000; i++) {
            if (i % num == 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
