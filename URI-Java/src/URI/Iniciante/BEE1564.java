package URI.Iniciante;

import java.util.Scanner;

public class BEE1564 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int reclama = sc.nextInt();
            if (reclama == 0){
                System.out.println("vai ter copa!");
            }else {
                System.out.println("vai ter duas!");
            }
        }
        sc.close();
    }
}
