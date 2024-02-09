package aplicação;
import java.util.Scanner;
import java.util.Locale;

import entidade.Produto;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i=0; i<vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double soma = 0;
            for(int i=0; i<vect.length; i++){
            soma += vect[i].getPreco();
            }
        
        double med = soma/vect.length;

        System.out.printf("Media = %.2f%n", med);
        sc.close();
    }
}
