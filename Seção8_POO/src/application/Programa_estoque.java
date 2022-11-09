package application;

import java.util.Scanner;

import entidade.produtos;

public class Programa_estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        produtos produto;

        produto = new produtos();

        System.out.println("Entre com os produtos.");
        System.out.print("nome: ");
        produto.nome = sc.nextLine();
        System.out.print("Valor: ");
        produto.valor = sc.nextDouble();
        System.out.print("Quantidade: ");
        produto.quantidade = sc.nextInt();
        
        System.out.println(produto);

        System.out.println();
        System.out.print("Coloque a quantidade adicional: ");
        int quantidade = sc.nextInt();
        produto.adicionar(quantidade);
        System.out.println(produto);

        System.out.println();
        System.out.print("Coloque a qunatidade de produto para ser retirada: ");
        quantidade = sc.nextInt();
        produto.remover(quantidade);
        System.out.println(produto);

        sc.close();
    }
}
