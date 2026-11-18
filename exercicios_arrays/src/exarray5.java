import java.util.Scanner; 
public class exarray5 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in); 

        int pares = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt(); 


            if (numero % 2 == 0) {
                pares++; 
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        sc.close(); 
    }
}