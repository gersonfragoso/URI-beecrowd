package URI.Iniciante;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class BEE1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        String s = sc.next();
        double[][] matriz = new double[12][12];
        for (int i = 0; i <12;i++){
            for (int j =0; j <12;j++){
                matriz[i][j] = sc.nextDouble();
            }
        }
        double valor = 0;
        for (int i = 0; i <12;i++){
            valor+=matriz[i][col];
        }
        if (Objects.equals(s, "S")){
            System.out.printf(Locale.US,"%.1f",valor);
        } else if (Objects.equals(s, "M")) {
            valor/=12;
            System.out.printf(Locale.US,"%.1f",valor/12);
        }
    }
}
