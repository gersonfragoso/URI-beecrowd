package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2381 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int K = scanner.nextInt();
            scanner.nextLine();
            String[] alunos = new String[N];
            for (int i = 0; i < N; i++) {
                alunos[i] = scanner.nextLine();
            }
            System.out.println(alunos[0]);
            scanner.close();
        }


}
