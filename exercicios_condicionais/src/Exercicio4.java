import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println("O maior numero e " + a);
		} else if (b > a) {
			System.out.println("O maior numero e " + b);
		} else {
			System.out.println("Os numeros sao iguais");
		}
		sc.close();
	}
}