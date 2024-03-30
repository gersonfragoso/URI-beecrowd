package URI.Iniciante;

import java.util.Scanner;

public class BEE1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <4*num; i+=3){
            System.out.println(i+" "+(i+1)+" "+(i+2)+" "+ "PUM");
            i++;
        }
        sc.close();
    }
}
