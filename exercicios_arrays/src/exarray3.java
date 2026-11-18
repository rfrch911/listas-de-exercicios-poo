import java.util.Scanner;

public class exarray3 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] n = new int[8]; 

      
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        
        int maior = n[0];
        int menor = n[0];

       
        for (int i = 1; i < n.length; i++) {
            if (n[i] > maior) {
                maior = n[i]; 
            }
            if (n[i] < menor) {
                menor = n[i]; 
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}