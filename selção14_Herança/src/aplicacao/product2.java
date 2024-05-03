package aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;
public class product2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of product: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char tp = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if(tp == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);
            }
            else if (tp == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufacturDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, manufacturDate);
                list.add(product);
            }
            else{
                Product product = new Product(name, price);
                list.add(product);
            }
        }

        System.out.println("\nPrice Tags:");
        for(Product product:list){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}
