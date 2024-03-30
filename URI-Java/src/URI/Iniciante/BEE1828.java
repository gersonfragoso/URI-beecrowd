package URI.Iniciante;

import java.util.Scanner;

public class BEE1828 {
    /*
    No oitavo episodio da segunda temporada do seriado The Big Bang Theory,
    The Lizard-Spock Expansion, Sheldon e Raj discutem qual dos dois é o melhor:
    o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj para a resolução do
    impasse é uma disputa de Pedra-Papel-Tesoura. Contudo, Sheldon argumenta que,
    se as partes envolvidas se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas,
     e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

        As regras do jogo proposto são:

        a tesoura corta o papel;
        o papel embrulha a pedra;
        a pedra esmaga o lagarto;
        o lagarto envenena Spock;
        Spock destrói a tesoura;
        a tesoura decapita o lagarto;
        o lagarto come o papel;
        o papel contesta Spock;
        Spock vaporiza a pedra;
        a pedra quebra a tesoura.
Embora a situação não se resolva no episódio (ambos escolhem Spock, resultando em um empate),
não é difıcil deduzir o que aconteceria se a disputa continuasse. Caso Sheldon vencesse, ele se
deleitaria com a vitória, exclamando "Bazinga!"; caso Raj vencesse, ele concluiria que "Raj trapaceou!";
caso o resultado fosse empate, ele exigiria nova partida: "De novo!". Conhecidas as personagens do jogo escolhido por ambos,
faça um programa que imprima a provável reação de Sheldon.

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int caso = 1;
        for (int i = 0; i < v; i++) {
            String sheldon = sc.next();
            String raj = sc.next();

            if (sheldon.equals("tesoura")) {
                if (raj.equals("papel")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("pedra")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("lagarto")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("Spock")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("tesoura")) {
                    System.out.println("Caso #" + caso + ": De novo!");
                    caso++;
                }
            } else if (sheldon.equals("papel")) {
                if (raj.equals("papel")) {
                    System.out.println("Caso #" + caso + ": De novo!");
                    caso++;
                } else if (raj.equals("pedra")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("lagarto")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("Spock")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("tesoura")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                }
            } else if (sheldon.equals("pedra")) {
                if (raj.equals("papel")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("pedra")) {
                    System.out.println("Caso #" + caso + ": De novo!");
                    caso++;
                } else if (raj.equals("lagarto")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("Spock")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("tesoura")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                }
            } else if (sheldon.equals("lagarto")) {
                if (raj.equals("papel")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("pedra")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("lagarto")) {
                    System.out.println("Caso #" + caso + ": De novo!");
                    caso++;
                } else if (raj.equals("Spock")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("tesoura")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                }

            } else if (sheldon.equals("Spock")) {
                if (raj.equals("papel")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("pedra")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                } else if (raj.equals("lagarto")) {
                    System.out.println("Caso #" + caso + ": Raj trapaceou!");
                    caso++;
                } else if (raj.equals("Spock")) {
                    System.out.println("Caso #" + caso + ": De novo!");
                    caso++;
                } else if (raj.equals("tesoura")) {
                    System.out.println("Caso #" + caso + ": Bazinga!");
                    caso++;
                }
            }
        }

    }
}
