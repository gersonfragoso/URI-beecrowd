package URI.Iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>vetor = new ArrayList<>();
        int reverter = 19;

        for (int i = 0; i < 20; i++){
            int num = sc.nextInt();
            vetor.add(num);
        }
        for (int i = 0; i < vetor.size(); i++){
            System.out.println("N["+i+"] = "+vetor.get(reverter));
            reverter-=1;
        }

        sc.close();
    }
}
