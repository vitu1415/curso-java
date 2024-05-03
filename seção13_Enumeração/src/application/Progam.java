package application;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Departamento;
import entities.Trabalho;
import entities.enums.levelTrabalho;
import entities.HoraContrato;

public class Progam {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamentoNome = sc.nextLine();
        System.out.println("Coloque a data do trabalho:");
        System.out.print("Nome: "); 
        String trabalhoNome = sc.nextLine();
        System.out.print("Level: ");
        String trabalhoLevel = sc.nextLine();
        System.out.print("Salario base: ");
        Double baseSalario = sc.nextDouble();
        Trabalho trabalho = new Trabalho(trabalhoNome, levelTrabalho.valueOf(trabalhoLevel), baseSalario, new Departamento(departamentoNome));

        System.out.print("Quantos contratos você tem: ");
        int n = sc.nextInt();
            for(int i=1; i <= n; i++){
            System.out.println("Entre com o #"+i+" contrato:");
            System.out.print("Data (DD/MM/AAAA): ");
            Date contratoDate = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            HoraContrato contrato = new HoraContrato(contratoDate, valorPorHora, horas);
            trabalho.addContratos(contrato);
        }

        System.out.println();
        System.out.print("Entre com o mês e ano para calcular (MM/yyyy): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Name: " + trabalho.getNome());
        System.out.println("Departamento: "+ trabalho.getDepartamento().getNome());
        System.out.println("Salario no "+mesEAno+": "+String.format("%.2f", trabalho.income(ano, mes)));
    sc.close();
    }
}