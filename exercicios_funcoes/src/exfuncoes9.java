import java.util.Scanner;

public class exfuncoes9 {
	
    static Scanner sc = new Scanner(System.in);
    static double saldo = 0; 

    static void mostrarMenu() {
        System.out.println("\n1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    static double lerValor() {
        System.out.print("Valor: R$ ");
        return sc.nextDouble();
    }

    static boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }

    static boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    static void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        int opcao;
        do {
            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (depositar(lerValor())) System.out.println("Depósito realizado.");
                    else System.out.println("Valor inválido.");
                    break;
                case 2:
                    if (sacar(lerValor())) System.out.println("Saque realizado.");
                    else System.out.println("Valor inválido ou saldo insuficiente.");
                    break;
                case 3:
                    consultarSaldo();
                    break;
            }
        } while (opcao != 0);
    }
}