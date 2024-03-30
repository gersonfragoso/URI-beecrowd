package URI.Iniciante;

import java.util.Scanner;

public class BEE1133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int valorReserva = 0;
        if (num2 < num1){
            valorReserva = num2;
            num2 = num1;
            num1 = valorReserva;
        }
        for(int i = num1; i < num2; i++){
            if (i %5 == 3||i %5 == 2){
                System.out.println(i);;
            }
        }
        sc.close();
    }
}
