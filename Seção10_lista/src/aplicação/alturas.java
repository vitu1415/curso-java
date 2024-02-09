package aplicação;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vc ira digitar: ");
        int n = sc.nextInt();
        
        String[] nome = new String [n];
        int[] idade = new int [n];
        double[] altura = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da "+(1+i)+" pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("idade: ");
            idade[i] = sc.nextInt();
            System.out.print("altura: ");
            altura[i] = sc.nextDouble();
        }
        
        double altura_media = 0.00, idade_menor = 0.00;
        for(int i=0; i<n; i++){
            altura_media += altura[i];
        }
        altura_media = altura_media/n;

        for(int i=0; i<n; i++){
            if(idade[i]<16){
                idade_menor += 1;
            }
        }
        idade_menor = (idade_menor/n)*100;
        System.out.printf("Altura média: %.2f\n", altura_media);
        System.out.printf("Pessoas com menor de 16 naos: %.1f%%\n",idade_menor);
        
        for(int i=0; i<n; i++){
            if(idade[i]<16){
                System.out.println(nome[i]);
            }
        }
    sc.close();
    }
}
