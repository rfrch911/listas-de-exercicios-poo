import java.util.Scanner;
public class exarray2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] numeros = new int[10];
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: " + (i+1) + ":");
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 0; i < numeros.length; i++) {
			soma = soma + numeros[i];
			
		}
		
		System.out.println("A soma dos elementos é: " + soma);
	}

}
