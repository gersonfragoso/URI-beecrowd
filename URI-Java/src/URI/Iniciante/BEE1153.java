package URI.Iniciante;

import java.util.Scanner;

public class BEE1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 1;
        for (int i = 2; i <=x; i++){
            result*=i;
        }
        System.out.println(result);
        sc.close();
    }
}
