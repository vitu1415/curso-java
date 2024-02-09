package application;

import java.util.Scanner;

import entidade.produtos;

public class Programa_estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com os produtos.");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();
        produtos produtos = new produtos(nome, valor, quantidade);

        System.out.println(produtos.toString());

        System.out.println();
        System.out.print("Coloque a quantidade adicional: ");
        quantidade = sc.nextInt();
        produtos.adicionar(quantidade);
        System.out.println(produtos.toString());

        System.out.println();
        System.out.print("Coloque a qunatidade de produto para ser retirada: ");
        quantidade = sc.nextInt();
        produtos.remover(quantidade);
        System.out.println(produtos.toString());

        sc.close();
    }
}
