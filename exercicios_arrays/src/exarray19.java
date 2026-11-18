import java.util.Scanner;

public class exarray19 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        boolean identidade = true; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && m[i][j] != 1) {
                    identidade = false; 
                }
                if (i != j && m[i][j] != 0) {
                    identidade = false; 
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz NÃO é identidade.");
        }

        sc.close();
    }
}