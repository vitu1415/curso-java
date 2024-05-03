package application;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

import entities.enums.ordemStatus;
import entities.Client;
import entities.Orden;
import entities.orderItem;
import entities.Product;

public class program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail= sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date clientDate = sdf.parse(sc.nextLine());
        System.out.println("Enter  orden date:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        Orden orden = new Orden(new Date(), ordemStatus.valueOf(status), new Client(clientName, clientEmail, clientDate));

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter #"+i+" item data:");
            System.out.print("Product name: ");
            String nameProduct = sc.next();
            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityProduct = sc.nextInt();
            orderItem item = new orderItem(quantityProduct, priceProduct, new Product(nameProduct, priceProduct));
            orden.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(orden);

        sc.close();
    }
}
