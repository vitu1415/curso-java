package aplicação;
import java.util.Scanner;
import entidade.Banco;

public class bc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.print("coloque o número da sua conta: ");
        int num = sc.nextInt();
        System.out.print("coloque o seu nome: ");
        String nome = sc.next();
        System.out.print("deseja fazer um deposito (s/n): ");
        String dep = sc.next();

    if (dep.equals("s")){
        System.out.print("quanto vc quer depositar: ");
        double dinheiro_inicial = sc.nextDouble();

        banco = new Banco (num, nome, dinheiro_inicial);

    }
    else {
        banco = new Banco (num, nome);
        
    }
    System.out.println(banco.texto());
    System.out.println();

    System.out.print("Entre com o valor para deposito: ");
    double deposito_dinheiro = sc.nextDouble();
    banco.deposito(deposito_dinheiro);        
    System.out.println("Update das informaçõs: ");
    System.out.println(banco.texto());
    System.out.println();

    System.out.print("Entre com o valor para ser retirado: ");
    double retirada_dinehiro = sc.nextDouble();
    banco.retirar(retirada_dinehiro);
    System.out.println("Update das informaçõs: ");
    System.out.println(banco.texto());
        
    }
}
