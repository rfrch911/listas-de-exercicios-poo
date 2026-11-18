import java.util.Scanner;

public class exarray20 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[][] m = new int[3][3];
        int[] somaLinha = new int[3];  
        int[] somaColuna = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();

                somaLinha[i] += m[i][j];  
                somaColuna[j] += m[i][j]; 
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha[i]);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna[j]);
        }

        sc.close();
    }
}