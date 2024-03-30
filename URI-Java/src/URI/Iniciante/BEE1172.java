package URI.Iniciante;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BEE1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer>vetor = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int num = sc.nextInt();
            vetor.add(num);
        }
        for (int i = 0; i < vetor.size();i++){
            if (vetor.get(i) <=0){
                System.out.println("X["+i+"]"+" = 1");
            }else {
                System.out.println("X["+i+"]"+" = "+vetor.get(i));
            }
        }
    }
}
