import java.util.Scanner;

public class ExercicioLaço11 {
	public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int numero = 0;
		 
		 do {
			 System.out.println("Digite o numero: ");
			 numero = sc.nextInt();
		 } while (numero < 1 || numero > 10);
	 }
}
