import java.util.Scanner;

public class exarray7 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        System.out.print("Digite o valor X: ");
        int x = sc.nextInt();

        boolean encontrado = false; 

        for (int i = 0; i < n.length; i++) {
            if (n[i] == x) {
                encontrado = true; 
                break;            
            }
        }

        if (encontrado) {
            System.out.println(x + " está presente no array.");
        } else {
            System.out.println(x + " NÃO está presente no array.");
        }

        sc.close();
    }
}