import java.util.Scanner;

class main{	
	public static void main(String[] args) {
		String product1 = "computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measue = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measue);
		System.out.printf("US decimal point: %.3f%n%n", measue);
		
		Scanner sc = new Scanner (System.in);
		
		String y1, y2;
		int x;
		double z;  
		x = sc.nextInt();
		y1 = sc.next();//lê somente uma palavra
		//y2 = sc.nextLine();  lê toda a linha
		z = sc.nextDouble();
		System.out.println("Informações digitadas:");
		System.out.println(x);
		System.out.println(y1);
		System.out.println(z);
		sc.close();
	}
}

//Math.sqrt = raiz quadrada de qualquer número
//Math.pow = número elevado
//Math.abs = não tem numero negativo  