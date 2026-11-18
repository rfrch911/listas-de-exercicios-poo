import java.util.Scanner;

public class exarray8 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        int contador = 0; 

        for (int i = 0; i < n.length; i++) {
            if (n[i] == x) {
                contador++; 
            }
        }

        System.out.println(x + " aparece " + contador + " vezes");

        sc.close();
    }
}