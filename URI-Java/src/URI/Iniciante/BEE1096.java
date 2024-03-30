package URI.Iniciante;

public class BEE1096 {
    public static void main(String[] args) {
        boolean roda = true;
        while (roda) {
            int j = 7;
            for (int i = 1; i <= 9; ) {
                if (5 <= j) {
                    System.out.println("I=" + i + "J=" + j);
                    j--;
                    if (j == 5) {
                        System.out.println("I=" + i + "J=" + j);
                        j = 7;
                        i += 2;
                    }
                }
                if (i == 9) {
                    roda = false;
                }
            }
        }
    }
}
