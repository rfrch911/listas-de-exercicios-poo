public class Main {

    static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void mostrarPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void mostrarImpares() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Todos:");
        mostrarNumeros();
        System.out.println("Pares:");
        mostrarPares();
        System.out.println("Ímpares:");
        mostrarImpares();
    }
}