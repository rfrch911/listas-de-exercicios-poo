import java.util.Scanner;

public class exarray9 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    int aux = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = aux;
                }
            }
        }

        System.out.println("Ordem crescente:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}