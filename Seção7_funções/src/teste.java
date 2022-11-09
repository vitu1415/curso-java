import java.util.Scanner;

public class teste {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num2 = 0;
        for (int i = 0; i < 3; i += 1){
            num1 = sc.nextInt();
            if (num1 > num2){
                num2 = num1;
            }
        }
        System.out.println("Maior número: "+num2);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);
        showResult(higher);
        sc.close();
        }
        //Representa as funções MAX e SHOWRESULT
        public static int max(int x, int y, int z) {
        int aux;
        
        if (x > y && x > z) {
        aux = x;
        } 
        else if (y > z) {
        aux = y;
        } 
        else {
        aux = z;
        }
        return aux;
        }
        
        public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
