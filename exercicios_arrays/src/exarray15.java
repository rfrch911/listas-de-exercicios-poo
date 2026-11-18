import java.util.Scanner;

public class exarray15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];
        int pares = 0; // contador

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();

                if (m[i][j] % 2 == 0) { // resto 0 = par
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de números pares: " + pares);

        sc.close();
    }
}