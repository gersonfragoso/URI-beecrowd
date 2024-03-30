package URI.Iniciante;

import java.util.Scanner;

public class BEE1847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperaturaDia1 = sc.nextInt();
        int temperaturaDia2 = sc.nextInt();
        int temperaturaDia3 = sc.nextInt();

        if (temperaturaDia2 < temperaturaDia1 && (temperaturaDia3 > temperaturaDia2 || temperaturaDia3 == temperaturaDia2)) {
            System.out.println(":)");
        } else if (temperaturaDia2 > temperaturaDia1 && (temperaturaDia3 < temperaturaDia2 || temperaturaDia3 == temperaturaDia2)) {
            System.out.println(":(");
        } else if (temperaturaDia2 > temperaturaDia1 && temperaturaDia3 > temperaturaDia2 && (temperaturaDia3 - temperaturaDia2) < (temperaturaDia2 - temperaturaDia1)) {
            System.out.println(":(");
        } else if (temperaturaDia2 > temperaturaDia1 && temperaturaDia3 > temperaturaDia2 && (temperaturaDia3 - temperaturaDia2) >= (temperaturaDia2 - temperaturaDia1)) {
            System.out.println(":)");
        } else if (temperaturaDia2 < temperaturaDia1 && temperaturaDia3 < temperaturaDia2 && (temperaturaDia2 - temperaturaDia3) < (temperaturaDia1 - temperaturaDia2)) {
            System.out.println(":)");
        } else if (temperaturaDia2 < temperaturaDia1 && temperaturaDia3 < temperaturaDia2 && (temperaturaDia2 - temperaturaDia3) >= (temperaturaDia1 - temperaturaDia2)) {
            System.out.println(":(");
        } else if (temperaturaDia2 == temperaturaDia1) {
            if (temperaturaDia3 > temperaturaDia2) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }

        sc.close();
    }
}
