import java.util.Scanner;

public class ExercicioLaço10 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int soma = 0;
		 int numero = 0;
		 
		 do {
			 System.out.println("Digite um numero: ");
			 numero = sc.nextInt();
			 soma += numero;
		 } while (!(numero== 0));
		 
		 System.out.println("Aqui esta a soma: " + soma);
		 
		sc.close();
	 }
}