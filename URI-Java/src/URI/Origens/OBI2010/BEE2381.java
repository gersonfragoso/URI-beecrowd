package URI.Origens.OBI2010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BEE2381 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        List<String> alunos = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String aluno = scanner.next();
            alunos.add(aluno);
        }
        Collections.sort(alunos);
        System.out.println(alunos.get(K - 1));
        scanner.close();
    }


}
