import java.util.Random;

public class exfuncoes13 {
	
    static Random rand = new Random();
    static final int VIDA_MAXIMA = 100; 

    static int criarPersonagem() {
        return VIDA_MAXIMA;
    }

    static void mostrarStatus(String nome, int vida) {
        System.out.println(nome + " - Vida: " + vida + "/" + VIDA_MAXIMA);
    }

    static int atacar() {
        return rand.nextInt(16) + 5;
    }

    static int receberDano(int vida, int dano) {
        return Math.max(0, vida - dano);
    }

    static int curar(int vida, int quantidade) {
        return Math.min(VIDA_MAXIMA, vida + quantidade);
    }

    public static void main(String[] args) {
        int heroi = criarPersonagem();
        int monstro = criarPersonagem();

        while (heroi > 0 && monstro > 0) {
            int dano = atacar();
            monstro = receberDano(monstro, dano);
            System.out.println("Herói causou " + dano + " de dano!");

            if (monstro > 0) { 
                dano = atacar();
                heroi = receberDano(heroi, dano);
                System.out.println("Monstro causou " + dano + " de dano!");

                if (heroi > 0 && heroi < 30) { 
                    heroi = curar(heroi, 20);
                    System.out.println("Herói se curou!");
                }
            }
            mostrarStatus("Herói", heroi);
            mostrarStatus("Monstro", monstro);
        }
    }
}