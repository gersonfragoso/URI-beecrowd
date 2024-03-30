package URI.Iniciante;

public class BEE1097 {
    public static void main(String[] args) {
        int num = 7;
        int num2 = 5;
        for (int i = 1; i <= 9; i += 2) {
            for (int j = num; j >= num2; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            num += 2;
            num2 += 2;
        }
    }
}
