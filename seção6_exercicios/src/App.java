import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    /*Scanner sc = new Scanner(System.in);
    int SenhaCorreta, SenhaDijitada;
    SenhaCorreta = 2002;
    SenhaDijitada = sc.nextInt();    
    while(SenhaCorreta != SenhaDijitada){
        System.out.println("Senha invalida");
        SenhaDijitada = sc.nextInt();
    }
    System.out.println("acesso permitido");
    sc.close();*/
    Scanner sc = new Scanner(System.in);
    int x, y;
    x = 1;
    y = 1;
    while (x != 0 && y != 0){
        x = sc.nextInt();
        y = sc.nextInt();
        if (x > 0 && y > 0){
            System.out.println("peimeiro");
        }
        else if (x < 0 && y > 0){
            System.out.println("segundo");
        }
        else if (x < 0 && y < 0){
            System.out.println("terceiro");
        }
        else if(x != 0 && y != 0){
            System.out.println("quarto");
        }
    }
    sc.close();
    /*Scanner sc = new Scanner(System.in);
    int x, alcool, gasolina, disel;
    x = 0;
    alcool = 0;
    gasolina = 0;
    disel = 0;
    while (x != 4){
        x = sc.nextInt();
        if (x == 1){
            alcool += 1;
        }
        else if (x == 2){
            gasolina += 1;
        }
        else if (x == 3){
            disel += 1;
        }
    }
    System.out.println("MUITO OBRIGADO\nAlcool = "+alcool+"\nGasolina = "+gasolina+"\ndisel = "+disel);
    sc.close();*/    

    }
}
