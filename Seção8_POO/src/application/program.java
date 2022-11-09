package application;

import java.util.Scanner;

import entidade.triangle;

public class program {
    public static void main(String[] args) {
        System.out.println("Digite os valores de X:");
        Scanner sc = new Scanner(System.in);
        
        triangle x, y;

        x = new triangle();
        y = new triangle();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        System.out.println("Digite os valores de Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        /*double p = (x.a + x.b + x.c)/2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        
        p = (y.a + y.b + y.c)/2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));*/

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        
        if (areaX > areaY) {
        System.out.println("Larger area: X");
        }
        else if (areaX < areaY){
        System.out.println("Larger area: Y");
        }
        else {
            System.out.println("Large area: X = Y");
        }
        
        sc.close();
    }
}
