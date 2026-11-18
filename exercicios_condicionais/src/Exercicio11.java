import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();
        
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        switch (op) {
        case '+': 
        	System.out.println("Resultado: " + (numero1 + numero2));
        	break;
        	
        case '-':
        	System.out.println("Resultado: " + (numero1 - numero2));
        	break;
        	
        case '*':
        	System.out.println("Resultado: " + (numero1 * numero2));
        	
        case '/':
        	if (numero2 != 0) {
        		System.out.println("Resultado: " + (numero1 / numero2));
        	} else {
        	System.out.println("Divisao nao permitida");
        } 
        break;
       default:
    	   System.out.println("Divisao invalida");

        
        sc.close();
    }
    }
}
