package URI.Iniciante;

import java.util.Scanner;

public class BEE1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaValida = 2002;
        boolean repete = true;
        while (repete){
            int senha = sc.nextInt();
            if (senhaValida == senha){
                System.out.println("Acesso Permitido");
                repete= false;
            }else {
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}
