import java.util.Scanner; 

public class exarray6 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[5]; 

       
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = sc.nextInt();
        }

        
        System.out.println("Ordem inversa:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }

        sc.close();
    }
}