package URI.Iniciante;

public class BEE1156 {
    public static void main(String[] args) {
        float s = 1;
        float divi = 2;
        for (int i = 3; i <= 39; i += 2) {
            float r = i / divi;
            s += r;
            divi *= 2;
        }

        System.out.printf("%.2f\n", s);
    }
}
