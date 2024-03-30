package URI.Iniciante;

import java.util.Scanner;

public class BEE1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i =0; i <x; i++){
            int num = sc.nextInt();
            int sum = 0;
            for (int j = 1; j < num; j++){
                if (num%j==0){
                    sum+=j;
                }
            }
            if (sum == num){
                System.out.println(num+" eh perfeito");
                sum = 0;

            }else {
                System.out.println(num+" nao eh perfeito");
                sum = 0;
            }
        }
        sc.close();
    }
}
