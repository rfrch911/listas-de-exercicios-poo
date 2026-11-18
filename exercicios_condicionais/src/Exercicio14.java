import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero do primeiro lado: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o numero segundo lado: ");
        int b = sc.nextInt();
        
        System.out.print("Digite o numero do terceiro lado: ");
        int c = sc.nextInt();
        
        if(a == b && b == c) {
        	System.out.println("Triangulo equilatero");
        	
        } else if (a == b || a == c || b == c) {
        	System.out.println("Triangulo isoceles");
        } else {
        	System.out.println("Triangulo escaleno");
        }
        
      
        sc.close();
    }
}