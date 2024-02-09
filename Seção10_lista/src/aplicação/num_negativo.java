package aplicação;

import java.util.Scanner;

public class num_negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros vc irá colocar: ");
        int n = sc.nextInt();
        int[] vect = new int [n];

        for(int i=0; i<vect.length; i++){
            System.out.print("digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i=0; i<vect.length; i++){
            if (vect[i]<0){
                System.out.println(vect[i]);
            }
        }
        
        sc.close();
    }    
}
