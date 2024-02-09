package aplicação;
import java.util.Scanner;
import entidades.retangulo;

public class rt {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        retangulo retangulo;

        retangulo = new retangulo();

        System.out.println("Coloque os valores da altura e largura: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("area = " + retangulo.area());
        System.out.println("perimetro = "+ retangulo.perimetro());
        System.out.println("diagonal = "+ retangulo.diagonal());

        sc.close();
    }
}
