package URI.Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class BEE1154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        int r = 0;
        int z = 0;
        while (c){
            int x = sc.nextInt();
            if (x >= 0){
                r+=x;
                z++;
            }else {
                c = false;
            }

        }
        float media = (float) r /z;
        System.out.printf(Locale.US,"%.2f\n", media);
        sc.close();
    }
}
