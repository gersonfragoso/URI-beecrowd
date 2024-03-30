package URI.Iniciante;

import java.util.Scanner;

public class BEE1061 {
    public static void main(String[] args) {
        int dia = 0;
        int hora = 0;
        int min = 0;
        int seg = 0;

        Scanner sc = new Scanner(System.in);

        //primeiro dia
        sc.next();//pular a palavra dia e so pegar o numero
        int diaInicio = Integer.parseInt(sc.nextLine().split("\\s+")[1]); //Ler o número do dia

        // Ler o tempo de início
        String tempoCom1 = sc.nextLine().trim(); // remover os espaços em branco e ler a linha completa
        String[] separar = tempoCom1.split("\\s*:\\s*"); // regex para remover os : ficando assim so os numeros sepados
        int horas1 = Integer.parseInt(separar[0]);
        int min1 = Integer.parseInt(separar[1]);
        int seg1 = Integer.parseInt(separar[2]);
        //repete a mesma coisa do primeiro dia
        sc.next();
        int diaFim = Integer.parseInt(sc.nextLine().split("\\s+")[1]); // mesma coisa do primeiro
        String tempoCom2 = sc.nextLine().trim();
        String[] separar2 = tempoCom2.split("\\s*:\\s*");
        int horas2 = Integer.parseInt(separar2[0]);
        int min2 = Integer.parseInt(separar2[1]);
        int seg2 = Integer.parseInt(separar2[2]);

        // Calcular a duração do evento em segundos para ficar mais facil calcular depois
        int SomaDiaInicio = diaInicio * 86400 + horas1 * 3600 + min1 * 60 + seg1;
        int SomaDiaFim = diaFim * 86400 + horas2 * 3600 + min2 * 60 + seg2;
        int duracaoEvento = SomaDiaFim - SomaDiaInicio;

        // Calcular dias, horas, minutos e segundos da duração
        dia = duracaoEvento / 86400;
        duracaoEvento = duracaoEvento % 86400;
        hora = duracaoEvento / 3600;
        duracaoEvento = duracaoEvento % 3600;
        min = duracaoEvento / 60;
        seg = duracaoEvento % 60;

        System.out.println(dia + " dia(s)");
        System.out.println(hora + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(seg + " segundo(s)");

        sc.close();
    }
}

