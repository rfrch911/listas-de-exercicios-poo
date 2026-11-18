import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		if(numero >= 10 && numero <= 50) {
			System.out.println("Dentro do intervalo");
		} else {
			System.out.println("Fora do intervalo");
		}

		
		sc.close();
	}
}
