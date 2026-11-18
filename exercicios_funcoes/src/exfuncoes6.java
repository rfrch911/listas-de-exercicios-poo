import java.util.Scanner;

public class exfuncoes {
    static Scanner sc = new Scanner(System.in);

    static int lerNumero() {
        System.out.print("Tabuada de qual número? ");
        return sc.nextInt();
    }

    static void mostrarLinha(int n, int multiplicador) {
        System.out.println(n + " x " + multiplicador + " = " + (n * multiplicador));
    }

    static void exibirTabuada(int n) {
        for (int i = 1; i <= 10; i++) {
            mostrarLinha(n, i);
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        exibirTabuada(numero);
    }
}