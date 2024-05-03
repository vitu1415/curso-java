package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class product {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Entre com o numero de funcionarios: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Dados do funiconario #"+i);
            System.out.print("tercerizado (n/s)? ");
            char Outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (Outsourced == 's') {
                System.out.print("Additional charge: ");
                double additionalCharge  = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
            }
            else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }

        System.out.println("\nPAYMENTS:");
        for(Employee emp : list){
            System.out.println(emp.getName()+" - $ "+ String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
