package URI.Iniciante;

import java.util.Scanner;


public class BEE1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            Double a = sc.nextDouble();
            if (a == 0){
                break;
            }
            Double b = sc.nextDouble();
            Double c = sc.nextDouble();


            Double areaTotal = a * b;
            Double areaMaxima = (areaTotal / c) * 100;
            int ladoTerreno = (int) Math.sqrt(areaMaxima);
            System.out.println(ladoTerreno);

        }
    }
}
