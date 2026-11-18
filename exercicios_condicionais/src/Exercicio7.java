import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double a = sc.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double b = sc.nextDouble();
        
        double c = (a + b) / 2;
        
        System.out.println("Media: " + c);
        
        if (c >= 6) {
        	System.out.println("Aprovado");
        } else if (c >= 4 && c < 6) {
        	System.out.println("Recuperacao");
        } else {
        	System.out.println("Reprovado");
        }
        
        sc.close();
    }
}