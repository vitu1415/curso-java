package aplicação;
import java.util.Scanner;

import entidades.trabalhador;

public class tr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        trabalhador trabalho;

        trabalho = new trabalhador();
        
        System.out.print("Nome: ");
        trabalho.nome = sc.nextLine();
        System.out.print("salario bruto: ");
        trabalho.salario = sc.nextDouble();
        System.out.print("taxa: ");
        trabalho.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("deswcrição: "+ trabalho.frase());
        System.out.println();

        System.out.print("fala seu percentual de aumento: ");
        double percentual = sc.nextDouble();
        trabalho.aumento_de_salario(percentual);

        System.out.println();
        System.out.println("Atualização de seus dados: "+ trabalho.frase());

        sc.close();
    }
}
