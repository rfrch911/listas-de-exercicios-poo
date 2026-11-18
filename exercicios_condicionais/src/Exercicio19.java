import java.util.Scanner;

public class Exercicio19 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um valor para a temperatura: ");
		 int temperatura = sc.nextInt();
		 
		 if (temperatura < 15) {
			 System.out.println("Frio");
		 } else if (temperatura < 25) {
			 System.out.println("Agradável");
		 } else {
			 System.out.println("Quente");
		 }
	 }
}