package URI.Iniciante;

import java.util.Scanner;

public class BEE1113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean para = true;
        while (para){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 == num2){
                para = false;
            }
            else if (num1 > num2){
                System.out.println("Decrescente");
            } else if (num1 < num2) {
                System.out.println("Crescente");
            }
        }
        sc.close();
    }
}
