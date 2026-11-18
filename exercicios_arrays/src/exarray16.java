import java.util.Scanner;

public class exarray16 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int[][] m = new int[3][3]; 
        int[][] t = new int[3][3]; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
                t[j][i] = m[i][j]; 
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(t[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}