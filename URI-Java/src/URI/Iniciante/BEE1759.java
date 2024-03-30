package URI.Iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class BEE1759 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        for (int i = 0; i <v; i++){
            if (i==0){
                System.out.print("Ho ");
            }else {
                if (i == v-1){
                    System.out.println("Ho!");
                }else {
                    System.out.print("Ho ");
                }
            }
        }
    }
}
