import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*int num;
        num = sc.nextInt();

        while (num != 0){
            num = sc.nextInt();
        }
        System.out.println("Digitou 0 perdeu");
        sc.close();*/
        int n, num, soma;
        soma = 0;
        n = sc.nextInt();
        for (int i=0; i<n; i+=1){
            num = sc.nextInt();
            soma += num;
        }
        System.out.println(soma);
        sc.close();
    }   
}
