import java.util.Scanner;

public class exarray10 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        System.out.println("Valores unicos:");
        for (int i = 0; i < n.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (n[i] == n[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) { 
                System.out.println(n[i]);
            }
        }

        sc.close();
    }
}