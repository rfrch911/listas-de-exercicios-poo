import java.util.Scanner;

public class Exercicio17 {
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 
		  String usuarioAprovado = "admin";
	        String senhaAprovada = "1234";
	        boolean logado = false;

	        for (int tentativa = 1; tentativa <= 3; tentativa++) {
	        	System.out.println("Usuario: ");
	        	String usuario = sc.nextLine();

	        	System.out.println("Senha: ");
	        	String senha = sc.nextLine() ;

	        	if(usuario.equals(usuarioAprovado) && senha.equals(senhaAprovada)) {
	        		logado = true;
	        		System.out.println("Acesso permitido");
	        		break;
	        	} else {
	        		System.out.println("Dados incorretos");
	        	}

	        	if (!logado) {
	        		 System.out.println("Conta bloqueada");

	        	}



	        sc.close();
	        }
	 }
}
        
      
 

        
    