package URI.EstruturaEBibliotecas;

import java.util.LinkedList;
import java.util.Scanner;

public class BEE1119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt(); // N candidatos
            int k = scanner.nextInt(); // sentido horário
            int m = scanner.nextInt(); // anti-horário

            if (N == 0 && k == 0 && m == 0) {
                break;
            }

            LinkedList<Integer> candidatos = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                candidatos.add(i);
            }

            int indiceHorario = 0;
            int indiceAntiHorario = N - 1;
            boolean primeiro = true;

            while (!candidatos.isEmpty()) {
                int contadorHorario = 0;
                int contadorAntiHorario = 0;

                while (contadorHorario < k || contadorAntiHorario < m) {
                    if (contadorHorario < k) {
                        contadorHorario++;
                        indiceHorario = (indiceHorario + 1) % candidatos.size();
                    }

                    if (contadorAntiHorario < m) {
                        contadorAntiHorario++;
                        indiceAntiHorario = (indiceAntiHorario - 1 + candidatos.size()) % candidatos.size();
                    }
                }

                if (!primeiro) {
                    System.out.print(",");
                }

                if (indiceHorario != indiceAntiHorario) {
                    System.out.print(" ");
                    System.out.print(candidatos.remove(indiceAntiHorario < indiceHorario ? indiceAntiHorario : indiceAntiHorario - 1));
                    System.out.print(" ");
                    System.out.print(candidatos.remove(indiceHorario));
                } else {
                    System.out.print(" ");
                    System.out.print(candidatos.remove(indiceHorario));
                }

                primeiro = false;

                if (indiceAntiHorario < indiceHorario) {
                    indiceHorario--;
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
