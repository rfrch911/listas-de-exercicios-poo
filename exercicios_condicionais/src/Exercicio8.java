import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        
        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3) {
        	System.out.println("O primeiro numero e maior");
        } else if (num2 > num1 && num2 > num3) {
        	System.out.println("O segundo numero e maior");
        } else {
        	System.out.println("O terceiro numero e maior");
        }

        sc.close();
    }
}