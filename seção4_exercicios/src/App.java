import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //exercício 1
        /*int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("SOMA = "+ c);
        sc.close(); */ 

        //exercício 512 1 5.30
        Scanner sc = new Scanner(System.in);
        
        int cod1, cod2, quant1, quant2;
        double valor2, valor1, total;
        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();
       
        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();
        total = quant1 * valor1 + quant2 * valor2;
        System.out.printf("VALOR A PAGAR: R$ %.2f",total);
        sc.close();

    }
}
