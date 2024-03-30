package URI.Origens.OBI2010;

import java.util.Scanner;

public class BEE2377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();

        int numPedagios = 111/37;
        int custPedagios = P *numPedagios;
        int CustRodovia = L*K;
        int CustTotal = custPedagios+CustRodovia;

        System.out.println(CustTotal);
    }
}
