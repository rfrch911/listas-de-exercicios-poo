import java.util.Scanner;

public class exfuncoes3 {
    static Scanner sc = new Scanner(System.in); 

    static int lerNumero() {
        System.out.print("Digite um número: ");
        return sc.nextInt();
    }

    static boolean ehPar(int n) {
        return n % 2 == 0; 
    }

    static void mostrarResultado(int n, boolean par) {
        if (par) {
            System.out.println(n + " é par.");
        } else {
            System.out.println(n + " é ímpar.");
        }
    }

    public static void main(String[] args) {
        int numero = lerNumero();
        boolean par = ehPar(numero);
        mostrarResultado(numero, par);
    }
}