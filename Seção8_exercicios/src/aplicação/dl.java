package aplicação;
import java.util.Scanner;
import entidades.dolar;

public class dl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dolar real;
        
        real = new dolar();
        System.out.print("preço do dolar: ");
        real.p_dolar = sc.nextDouble();
        System.out.print("dinheiro em dolar: ");
        real.valor = sc.nextDouble();
        System.out.printf("O preço total em reais junto com a taxa = $%,.2f", real.total());

        sc.close();
    }
}
