import java.util.Random;
import java.util.Scanner;

public class exfuncoes11 {
	
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random(); 

    static int sortearNumero() {
        return rand.nextInt(100) + 1; 
    }

    static int lerPalpite() {
        System.out.print("Seu palpite (1-100): ");
        return sc.nextInt();
    }

    static boolean verificarAcerto(int palpite, int secreto) {
        return palpite == secreto;
    }

    static void mostrarDica(int palpite, int secreto) {
        if (palpite < secreto) {
            System.out.println("Dica: o número é MAIOR.");
        } else {
            System.out.println("Dica: o número é MENOR.");
        }
    }

    static void mostrarVitoria(int tentativas) {
        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
    }

    public static void main(String[] args) {
        int secreto = sortearNumero();
        int tentativas = 0;
        boolean acertou = false;

        while (!acertou) {
            int palpite = lerPalpite();
            tentativas++;
            acertou = verificarAcerto(palpite, secreto);

            if (!acertou) {
                mostrarDica(palpite, secreto);
            }
        }
        mostrarVitoria(tentativas);
    }
}