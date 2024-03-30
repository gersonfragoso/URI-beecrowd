package URI.EstruturaEBibliotecas;

import java.util.*;

class Familia{
    int pessoasImovel;
    int consumoCASA;
    public Familia(int pessoas, int consumo){
        this.pessoasImovel = pessoas;
        this.consumoCASA = consumo;
    }
}
public class BEE1023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consumoTotalCidade = 0;
        int pessoasTotalCidade = 0;
        ArrayList<Familia> familia = new ArrayList<>();
        int entrada = sc.nextInt();
        int cidade = 1;
        while (entrada != 0){
            for (int i =0; i<entrada;i++){
                int pessoasImovel = sc.nextInt();
                pessoasTotalCidade+=pessoasImovel;
                int consumoCASA = sc.nextInt();
                consumoTotalCidade+=consumoCASA;
                int valorConsumo = consumoCASA/pessoasImovel;
                familia.add(new Familia(pessoasImovel,valorConsumo));
            }
            Collections.sort(familia, Comparator.comparingInt(a -> a.consumoCASA));
            System.out.println("Cidade# "+cidade+":");
            for (int i =0; i < familia.size();i++){
                System.out.print(familia.get(i).pessoasImovel+"-"+ familia.get(i).consumoCASA+" ");
            }
            System.out.println();
            float mediaConsumoCidade = ((float) consumoTotalCidade /pessoasTotalCidade);
            System.out.printf(Locale.US,"Consumo medio: %.2f",mediaConsumoCidade);
            System.out.println(" m3.");
            System.out.println();

            familia.clear();
            cidade++;
            entrada = sc.nextInt();
        }
    }
}
