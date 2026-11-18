import java.util.Scanner;

public class exfuncoes8 {
    static Scanner sc = new Scanner(System.in);

    static String lerNome() {
        System.out.print("Nome: ");
        return sc.nextLine();
    }

    static int lerIdade() {
        System.out.print("Idade: ");
        return Integer.parseInt(sc.nextLine()); 
    }

    static String lerCidade() {
        System.out.print("Cidade: ");
        return sc.nextLine();
    }

    static void mostrarResumo(String nome, int idade, String cidade) {
        System.out.println("\n" + nome + ", " + idade + " anos, mora em " + cidade + ".");
    }

    public static void main(String[] args) {
        String nome = lerNome();
        int idade = lerIdade();
        String cidade = lerCidade();

        mostrarResumo(nome, idade, cidade);
    }
}