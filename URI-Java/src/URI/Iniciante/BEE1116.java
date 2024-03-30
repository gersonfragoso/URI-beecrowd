package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entr = sc.nextInt();
        for (int i =0; i < entr; i++){
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();
            if (num2 == 0){
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf(Locale.US,"%.1f\n",num1/num2);
            }
        }
        sc.close();
    }
}