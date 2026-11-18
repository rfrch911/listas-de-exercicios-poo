import java.util.Scanner;

public class Exercicio18 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 while (true) {
			 System.out.println("1 - Somar");
			 System.out.println("2 - Subtrair");
			 System.out.println("3 - Sair");
			 
			 System.out.print("Escolha uma opção: ");
			 int opcao = sc.nextInt();
			 
			 switch (opcao) {
			 case 1:
				 System.out.println("Você escolheu somar");
				 break;
				 
			 case 2:
				 System.out.println("Você escolheu subtrair");
				 break;
				 
			 case 3:
				 System.out.println("Você escolheu sair");
				 return;
				 
			default:
				System.out.println("Opção inválida");
					 
			 }
		 }
		  
	 }
}
        
      
 

        
