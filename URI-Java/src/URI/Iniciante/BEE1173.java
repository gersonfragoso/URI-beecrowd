package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> vetor = new ArrayList<>();
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            vetor.add(num);
            num *= 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("N[" + i + "]" + " = " + vetor.get(i));
        }
        sc.close();

    }
}
