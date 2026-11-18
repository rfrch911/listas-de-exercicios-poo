import java.util.Scanner;

public class exfuncoes10 {
    static Scanner sc = new Scanner(System.in);

    static String lerUsuario() {
        System.out.print("Usuário: ");
        return sc.next();
    }

    static String lerSenha() {
        System.out.print("Senha: ");
        return sc.next();
    }

    static boolean validarLogin(String usuario, String senha) {
        return usuario.equals("admin") && senha.equals("1234");
    }

    static void mostrarResultado(boolean sucesso) {
        if (sucesso) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }

    public static void main(String[] args) {
        String usuario = lerUsuario();
        String senha = lerSenha();

        boolean sucesso = validarLogin(usuario, senha);
        mostrarResultado(sucesso);
    }
}