import java.util.Scanner;

public class ExercicioLaço8 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int quantidade = 0;
		 double soma = 0;
		 
		 System.out.println("Quantos números você quer calcular?");
		 quantidade = sc.nextInt();
		 
		 for(int i = 1; i <= quantidade; i++) {
			 System.out.println("Digite o numero: ");
			 int numero = sc.nextInt();
			 soma += numero ;
		 }
		 double media = soma / quantidade;

		 System.out.println("Média: " + media);

		sc.close();
	 }
}