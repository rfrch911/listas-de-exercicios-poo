public class exfuncoes2 {

    static int somar(int a, int b) {
        return a + b;
    }

    static void mostrarResultado(int resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int soma = somar(n1, n2);   
        mostrarResultado(soma);     
    }
}