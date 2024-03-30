package URI.Iniciante;

import java.io.IOException;
import java.util.*;

public class BEE1049 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String nome1 = sc.next();
        String nome2 = sc.next();
        String nome3 = sc.next();
        if (nome1.equals("vertebrado")) {
            if (nome2.equals("mamifero")) {
                if (nome3.equals("onivoro")) {
                    System.out.println("homem");
                } else if (nome3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            } else if (nome2.equals("ave")) {
                if (nome3.equals("onivoro")) {
                    System.out.println("pomba");
                } else if (nome3.equals("carnivoro")) {
                    System.out.println("aguia");
                }

            }
        } else if (nome1.equals("invertebrado")) {
            if (nome2.equals("inseto")) {
                if (nome3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if (nome3.equals("herbivoro")) {
                    System.out.println("largata");
                }
            } else if (nome2.equals("anelideo")) {
                if (nome3.equals("onivoro")) {
                    System.out.println("minhoca");
                } else if (nome3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
            }

        }
        sc.close();

    }
}
