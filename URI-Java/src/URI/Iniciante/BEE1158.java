package URI.Iniciante;

import java.util.Scanner;

public class BEE1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < x; i++){
            int y = sc.nextInt();
            int z = sc.nextInt();
            int cont = 0;
            int var = y;
            while(cont< z){

                if (var%2!=0){
                    sum+=var;
                    cont++;
                }
                var++;
            }
            System.out.println(sum);
            sum=0;
        }
        sc.close();
    }
}
