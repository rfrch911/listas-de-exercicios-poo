import java.util.Scanner;

public class Exercicio20 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Digite um valor para o salario: ");
		 double salario = sc.nextDouble();
		 
		 double imposto = 0;
		 
		 if(salario <= 2000) {
			 System.out.println("Insento");
		 } else if (salario <= 5000) {
			 imposto = salario * 0.10;
		 } else {
			 imposto = salario * 0.20;
		 }
		 
		 System.out.println("Imposto: R$ " + imposto);
		 
	 }
}