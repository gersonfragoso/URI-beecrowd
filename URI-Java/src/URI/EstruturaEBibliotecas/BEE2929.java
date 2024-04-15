package URI.EstruturaEBibliotecas;

import java.util.Scanner;

class MenorDaPilha {

    static class No {
        long numero;
        No proximo;

        public No(long numero) {
            this.numero = numero;
            this.proximo = null;
        }
    }

    static class Pilha {
        No topo;

        public Pilha() {
            this.topo = null;
        }

        public void push(long numero) {
            No novoNo = new No(numero);
            novoNo.proximo = topo;
            topo = novoNo;
        }

        public void pop() {
            if (topo != null) {
                topo = topo.proximo;
            } else {
                System.out.println("EMPTY");
            }
        }

        public long menorDaPilha() {
            if (topo == null) {
                return -1;
            }

            long menor = topo.numero;
            No auxiliar = topo.proximo;

            while (auxiliar != null) {
                if (auxiliar.numero < menor) {
                    menor = auxiliar.numero;
                }
                auxiliar = auxiliar.proximo;
            }

            return menor;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOperacoes = scanner.nextInt();
        scanner.nextLine();

        Pilha pilha = new Pilha();

        while (numOperacoes-- > 0) {
            String operacao = scanner.next();

            switch (operacao) {
                case "PUSH":
                    long numero = scanner.nextLong();
                    pilha.push(numero);
                    break;
                case "POP":
                    pilha.pop();
                    break;
                case "MIN":
                    long menor = pilha.menorDaPilha();
                    if (menor == -1) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(menor);
                    }
                    break;
            }
        }

        scanner.close();
    }
}
