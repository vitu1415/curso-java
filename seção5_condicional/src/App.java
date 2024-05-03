import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*Scanner sc = new Scanner (System.in);

       int horas;
       System.out.println("Quantas horas?");
       horas = sc.nextInt();
       if (horas <= 12){
        System.out.println("Bom dia");
       }
       else if(horas < 18){
        System.out.println("Boa tarde");
       }
       else{
        System.out.println("Boa noite");
       }   

       //exercio 4
       Scanner sc = new Scanner(System.in);

       int h1, h2;
       h1 = sc.nextInt();
       h2 = sc.nextInt();

       if (h1 > h2){
        h1 = 24 - h1;
        h2 = h1 + h2;
        System.out.println("O JOGO DUROU "+h2+" HORA(s)");
       }
       else if (h1 < h2){
        h2 = h2 - h1;
        System.out.println("O JOGO DUROU "+h2+" HORA(s)");
       }
       else{
        System.out.println("O JOGO DUROU 24 HORA(s)");
       }*/
       
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        //usando switch
        switch (x) {
        case 1:
        dia = "domingo";
        break;
        case 2:
        dia = "segunda";
        break;
        case 3:
        dia = "terca";
        break;
        case 4:
        dia = "quarta";
        break;
        case 5:
        dia = "quinta";
        break;
        case 6:
        dia = "sexta";
        break;
        case 7:
        dia = "sabado";
        break;
        default:
        dia = "valor invalido";
        break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
