package aplicação;
import java.util.Scanner;

import entidade.produto_empresa;

public class empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Coloque a quantidade de funcionarios: ");
        int n = sc.nextInt();

        produto_empresa[] vect = new produto_empresa[n];

        //coletar dados dos funcionarios
        for(int i=0; i<n; i++){
            System.out.println("\nfuncionario #"+ (i+1)+":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salario: ");
            double salary = sc.nextDouble();
            vect[i] = new produto_empresa(id, name, salary);
        }
        
        //indentificação de ID, q vai aumentar o salario
        System.out.print("\nColoque o ID do funcionario, q vc quer aumentar o salario: ");
        int id_indetificacao = sc.nextInt();
        int x = 0;

        //localização de ID e verificação de sua existencia
        for(int i=0; i<n; i++){
            if(id_indetificacao == vect[i].getId()){
                System.out.print("coloque a porcentagem para aumentar: ");
                double porcent = sc.nextDouble();
                vect[i].aumento_salary(porcent);
            }
            else{
                x = x + 1;
            }

        }

        if (x == n){
            System.out.println("Esse ID não existe!!!");
        }

        //resultado final de como ficou cada funcionario
        for(int i=0; i<n; i++){
        System.out.print("\n"+vect[i].getId() + ", ");
        System.out.print(vect[i].getName()+", ");
        System.out.printf("%.2f", vect[i].getSalary());
        }
    
        sc.close();
    }
}