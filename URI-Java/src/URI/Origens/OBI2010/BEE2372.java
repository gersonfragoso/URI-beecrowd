package URI.Origens.OBI2010;

import java.util.*;

public class BEE2372 {
    static class Aresta {
        int destino, peso;

        public Aresta(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura da entrada
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        List<List<Aresta>> listaAdj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            listaAdj.add(new ArrayList<>());
        }

        // LENDO ESTRADAS
        for (int i = 0; i < M; i++) {
            int U = scanner.nextInt();
            int V = scanner.nextInt();
            int W = scanner.nextInt();
            listaAdj.get(U).add(new Aresta(V, W));
            listaAdj.get(V).add(new Aresta(U, W));
        }

        int menorDistanciaMaxima = encontrarMenorDistanciaMaxima(N, listaAdj);
        System.out.println(menorDistanciaMaxima);

        scanner.close();
    }

    // algoritmo para encontrar a menor distância máxima
    public static int encontrarMenorDistanciaMaxima(int N, List<List<Aresta>> listaAdj) {
        int[] distancias = new int[N]; // Vetor para armazenar as distâncias mínimas
        Arrays.fill(distancias, Integer.MAX_VALUE); // Inicializa todas as distâncias como infinito
        distancias[0] = 0; // A cidade da reunião está na posição 0

        // Fila de prioridade para processar as arestas de menor peso primeiro
        PriorityQueue<Aresta> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(a -> a.peso));
        filaPrioridade.offer(new Aresta(0, 0)); // Adiciona a cidade da reunião com peso 0 na fila

        // Execução do algoritmo de Dijkstra
        while (!filaPrioridade.isEmpty()) {
            Aresta atual = filaPrioridade.poll(); // Extrai a aresta de menor peso
            int noAtual = atual.destino;
            int pesoAtual = atual.peso;

            if (pesoAtual > distancias[noAtual]) {
                continue; // Já encontramos um caminho mais curto para este nó
            }

            // Percorre todas as arestas adjacentes ao nó atual
            for (Aresta vizinho : listaAdj.get(noAtual)) {
                int novaDistancia = pesoAtual + vizinho.peso;
                if (novaDistancia < distancias[vizinho.destino]) {
                    distancias[vizinho.destino] = novaDistancia;
                    filaPrioridade.offer(new Aresta(vizinho.destino, novaDistancia));
                }
            }
        }

        // Encontrar a menor distância máxima percorrida por um caminhoneiro
        int menorDistanciaMaxima = Integer.MIN_VALUE;
        for (int d : distancias) {
            menorDistanciaMaxima = Math.max(menorDistanciaMaxima, d);
        }

        return menorDistanciaMaxima;
    }
}