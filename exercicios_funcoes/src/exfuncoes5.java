import java.util.Scanner;

public class exfuncoes5 {
    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\n1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
    }

    static double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return sc.nextDouble();
    }

    static double somar(double a, double b)       { return a + b; }
    static double subtrair(double a, double b)    { return a - b; }
    static double multiplicar(double a, double b) { return a * b; }

    static double dividir(double a, double b) {
        if (b == 0) {
            return Double.NaN; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = (int) lerNumero("Escolha: ");

            if (opcao >= 1 && opcao <= 4) {
                double a = lerNumero("Primeiro número: ");
                double b = lerNumero("Segundo número: ");
                double r = 0;

                switch (opcao) {
                    case 1: r = somar(a, b); break;
                    case 2: r = subtrair(a, b); break;
                    case 3: r = multiplicar(a, b); break;
                    case 4: r = dividir(a, b); break;
                }

                if (Double.isNaN(r)) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    System.out.println("Resultado: " + r);
                }
            }
        } while (opcao != 0); 

        System.out.println("Encerrado.");
    }
}