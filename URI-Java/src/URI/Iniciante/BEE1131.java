package URI.Iniciante;

import java.util.Scanner;

public class BEE1131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int continuar = 1;
        int vitoriaInter = 0;
        int vitoriaGremio = 0;
        int empate = 0;

        while (continuar == 1){
            int inter = sc.nextInt();
            int gremio = sc.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            int termina = sc.nextInt();
            if (inter > gremio){
                vitoriaInter++;
            } else if (inter < gremio) {
                vitoriaGremio++;

            } else {
                empate++;
            }
            if (termina == 2){
                continuar++;
            }

        }
        System.out.println((vitoriaInter+vitoriaGremio)+" grenais");
        System.out.println("Inter:"+vitoriaInter);
        System.out.println("Gremio:"+vitoriaGremio);
        System.out.println("Empates:"+empate);
        if (vitoriaInter > vitoriaGremio){
            System.out.println("Inter venceu mais");
        } else if (vitoriaInter < vitoriaGremio) {
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}
