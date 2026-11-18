import java.util.Scanner;

public class exarray12 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[][] m = new int[3][3];
        int soma = 0; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                soma += m[i][j];
            }
        }

        System.out.println("Soma de todos os elementos: " + soma);

        sc.close();
    }
}