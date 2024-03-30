package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> vetor = new ArrayList<>();
        Double num = sc.nextDouble();
        for (int i = 0; i < 100; i++){
            vetor.add(num);
            num/=2;
        }
        for (int i = 0; i < vetor.size(); i++) {
            System.out.printf("N[" + i + "] = ");
            System.out.printf("%.4f\n",vetor.get(i));
        }
        sc.close();
    }
}
