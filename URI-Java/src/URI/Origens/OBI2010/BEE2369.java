package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorP = 0;
        int va = sc.nextInt();
        if (va <= 10) {
            System.out.println("7");
        } else if (11 <= va && va <= 30) {
            valorP += 7;
            va -= 10;
            valorP += va;
            System.out.println(valorP);
        } else if (va >= 31 && va <= 100) {
            valorP += 27;
            va -= 30;
            valorP = valorP + (va * 2);
            System.out.println(valorP);
        } else if (100 < va) {
            valorP = 7 + 20 + 140;
            va -= 100;
            valorP = valorP + (va * 5);
            System.out.println(valorP);

        }
        sc.close();
    }
}
