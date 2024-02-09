package aplicação;
import java.util.Scanner;
import entidades.nota;

public class nt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nota nota_final;

        nota_final = new nota();
        nota_final.nome = sc.nextLine();
        nota_final.nota1 = sc.nextDouble();
        nota_final.nota2 = sc.nextDouble();
        nota_final.nota3 = sc.nextDouble();

        System.out.println("nota final = " + nota_final.resultado());

        if (nota_final.resultado() < 60.0) {
            System.out.println("FALHA");
            System.out.printf("faltou %.2f POINTS%n", nota_final.teste());
            }
            else {
            System.out.println("PASSOU");
            }

        sc.close();
    }
}
