import java.util.Random;
import java.util.Scanner;

public class exfuncoes12 {
	
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static String[] NOMES = {"", "Pedra", "Papel", "Tesoura"}; 

    static void mostrarMenu() {
        System.out.println("\n1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
    }

    static int jogadaComputador() {
        return rand.nextInt(3) + 1;
    }

    static int jogadaJogador() {
        mostrarMenu();
        System.out.print("Sua jogada: ");
        return sc.nextInt();
    }

    static int verificarVencedor(int jogador, int computador) {
        if (jogador == computador) {
            return 0; 
        }
        if ((jogador == 1 && computador == 3)
                || (jogador == 2 && computador == 1)
                || (jogador == 3 && computador == 2)) {
            return 1;
        }
        return 2; 
    }

    static void mostrarResultado(int jogador, int computador, int vencedor) {
        System.out.println("Você: " + NOMES[jogador] + " | Computador: " + NOMES[computador]);
        if (vencedor == 0) {
            System.out.println("Empate!");
        } else if (vencedor == 1) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Computador venceu!");
        }
    }

    public static void main(String[] args) {
        int jogador = jogadaJogador();
        int computador = jogadaComputador();
        int vencedor = verificarVencedor(jogador, computador);
        mostrarResultado(jogador, computador, vencedor);
    }
}