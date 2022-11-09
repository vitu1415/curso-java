import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //exercício 1
        /*int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("SOMA = "+ c);
        sc.close(); */ 

        //exercício 5
        int num_peças, quant1, quant2;
        double valor2, valor1, total;
        Scanner sc = new Scanner(System.in);
        num_peças = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();
        num_peças = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();
        total = (quant1 * valor1) + (quant2 * valor2);
        System.out.printf("VALOR A PAGAR: R$ %.2f",total);
        sc.close();

    }
}
