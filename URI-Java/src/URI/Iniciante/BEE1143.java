package URI.Iniciante;

import java.util.Scanner;

public class BEE1143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i + " " + (i * i) + " " + (i * i * i));
        }
        sc.close();
    }
}
