package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int sum = 0;
        boolean para = true;
        while (para) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if (num1 == 0|| num1 <0 || num2 == 0 || num2 < 0) {
                para = false;
            }
            else if (num1 > num2) {
                for (int i = num2; i <= num1; i++) {
                    numeros.add(i);
                    sum += i;
                }

                System.out.print(numeros.toString().replaceAll("\\[|\\]|,", "") + " Sum=" + sum + "\n");
                numeros.clear();
                sum =0;

            }
            else if (num1 < num2) {
                for (int i = num1; i <= num2; i++) {
                    numeros.add(i);
                    sum += i;
                }
                System.out.print(numeros.toString().replaceAll("\\[|\\]|,", "") + " Sum=" + sum + "\n");
                numeros.clear();
                sum = 0;
            }
        }
        sc.close();
    }
}
