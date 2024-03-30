package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> vetor = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            float num = sc.nextFloat();
            vetor.add(num);
        }
        for (int i = 0; i < vetor.size(); i++) {
            if (vetor.get(i) <= 10){
                System.out.println("A[" + i + "]" + " = " + vetor.get(i));
            }
        }
        sc.close();

    }
}