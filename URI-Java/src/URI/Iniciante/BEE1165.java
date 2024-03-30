package URI.Iniciante;

import java.util.Scanner;

public class BEE1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int p = sc.nextInt();
            if (isPrime(p)) {
                System.out.println(p + " eh primo");
            } else {
                System.out.println(p + " nao eh primo");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
