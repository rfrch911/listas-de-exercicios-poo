import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui a sua idade: ");
		int numero = sc.nextInt();
		
		if(numero >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
	sc.close();	
	}
}