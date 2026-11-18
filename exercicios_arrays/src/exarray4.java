import java.util.Scanner;

public class exarray4 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        double[] n = new double[6]; 

        
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextDouble();
        }

        double soma = 0; 

        
        for (int i = 0; i < n.length; i++) {
            soma += n[i];
        }

        double media = soma / n.length; 

        System.out.println("Média: " + media);

        sc.close();
    }
}