package URI.Iniciante;

import java.util.Scanner;

public class BEE1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean cont = true;
        while (cont) {
            int y = sc.nextInt();
            int contagem = 0;
            int var = y;
            if (y == 0) {
                cont = false;
            } else {
                while (contagem < 5) {

                    if (var % 2 == 0) {
                        sum += var;
                        contagem++;
                    }
                    var++;
                }
                System.out.println(sum);
                sum = 0;

            }


        }
        sc.close();

    }
}
