import java.util.Scanner;

public class exarray11 {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3]; 

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz:");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t"); 
            }
            System.out.println(); 
        }

        sc.close();
    }
}