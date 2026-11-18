import java.util.Random;
import java.util.Scanner;

public class exfuncoes15 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static final int VIDA_MAXIMA = 100;

    static int criarJogador() {
        return VIDA_MAXIMA;
    }

    static void mostrarMenu(int[] vidas) {
        System.out.println("\nVocê: " + vidas[0] + " | Inimigo: " + vidas[1]);
        System.out.println("1 - Atacar");
        System.out.println("2 - Curar (+15)");
        System.out.print("Escolha: ");
    }

    static void turnoJogador(int[] vidas, int opcao) {
        if (opcao == 1) {
            int dano = rand.nextInt(16) + 5;
            vidas[1] = Math.max(0, vidas[1] - dano);
            System.out.println("Você causou " + dano + " de dano.");
        } else if (opcao == 2) {
            vidas[0] = Math.min(VIDA_MAXIMA, vidas[0] + 15);
            System.out.println("Você se curou.");
        } else {
            System.out.println("Opção inválida, perdeu a vez!");
        }
    }

    static void turnoInimigo(int[] vidas) {
        int dano = rand.nextInt(16) + 5;
        vidas[0] = Math.max(0, vidas[0] - dano);
        System.out.println("O inimigo causou " + dano + " de dano.");
    }

    static void executarTurno(int[] vidas, int opcao) {
        turnoJogador(vidas, opcao);
        if (vidas[1] > 0) {
            turnoInimigo(vidas);
        }
    }

    static boolean verificarVitoria(int[] vidas) {
        return vidas[0] == 0 || vidas[1] == 0; 
    }

    static void encerrarJogo(int[] vidas) {
        if (vidas[1] == 0) {
            System.out.println("\nVocê venceu a batalha!");
        } else {
            System.out.println("\nVocê foi derrotado...");
        }
    }

    static void iniciarJogo() {
        int[] vidas = {criarJogador(), criarJogador()}; 

        while (!verificarVitoria(vidas)) {
            mostrarMenu(vidas);
            int opcao = sc.nextInt();
            executarTurno(vidas, opcao);
        }
        encerrarJogo(vidas);
    }

    public static void main(String[] args) {
        iniciarJogo(); 
    }
}