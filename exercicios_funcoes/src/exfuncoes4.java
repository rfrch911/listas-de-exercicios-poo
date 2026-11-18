import java.util.Scanner;

public class exfuncoes4 {
    static Scanner sc = new Scanner(System.in);

    static double lerNota(int numero) {
        System.out.print("Digite a nota " + numero + ": ");
        return sc.nextDouble();
    }

    static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f - %s%n", media, situacao);
    }

    public static void main(String[] args) {
        double n1 = lerNota(1); 
        double n2 = lerNota(2);
        double n3 = lerNota(3);

        double media = calcularMedia(n1, n2, n3);
        String situacao = verificarSituacao(media);

        mostrarResultado(media, situacao);
    }
}