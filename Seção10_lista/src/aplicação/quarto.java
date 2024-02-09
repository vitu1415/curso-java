package aplicação;
import java.util.Scanner;

public class quarto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos: ");
        int n = sc.nextInt();

        String [] name = new String[n];
        String [] email = new String[n];
        int [] room = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("\nRent #"+(i + 1)+":");
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Email: ");
            sc.nextLine();
            email[i] = sc.next();
            System.out.print("Room: ");
            room[i] = sc.nextInt();
        }
        
        System.out.println("\nBusy Room:");
        for(int i=0; i<n; i++){
            System.out.println(room[i]+": "+name[i]+", "+email[i]);
        }
        sc.close();
    }
}
