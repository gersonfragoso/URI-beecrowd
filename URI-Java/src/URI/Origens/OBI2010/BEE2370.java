package URI.Origens.OBI2010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class aluno {
    String nome;
    int habilidade;

    public aluno(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }
}

public class BEE2370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qa = sc.nextInt();
        int t = sc.nextInt();
        ArrayList<aluno> alunos = new ArrayList<>();

        for (int i = 0; i < qa; i++) {
            String nome = sc.next();
            int habilidade = sc.nextInt();
            alunos.add(new aluno(nome, habilidade));
        }
        Collections.sort(alunos, Comparator.comparingInt(a -> -a.habilidade)); //ordenar em ordem decresente

        ArrayList<ArrayList<String>>times = new ArrayList<>();
        for (int i = 0; i<t; i++){
            times.add(new ArrayList<>());
        }
        for (int i = 0; i < qa; i++) {
            times.get(i % t).add(alunos.get(i).nome);
        }
        for (int i = 0; i <t ; i++){
            System.out.println("Time "+(i+1));
            ArrayList<String>time = times.get(i);
            Collections.sort(time);
            for (String jogador:time){
                System.out.println(jogador);
            }
            System.out.println();
        }

        sc.close();
    }
}
