import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();
        
        int nota100 = valor / 100;
        valor = valor % 100;
        
        int nota50 = valor / 50;
        valor = valor % 50;
        
        int nota20 = valor / 20;
        valor = valor % 20;
        
        int nota10 = valor / 10;
        valor = valor % 10;
        
        int nota5 = valor / 5;
        valor = valor % 5;
        
        int nota2 = valor / 2;
        valor = valor % 5;
        
        int nota1 = valor / 1;
        valor = valor % 1;
        
        System.out.println("Notas de 100: " + nota100);
        System.out.println("Notas de 50: " + nota50);
        System.out.println("Notas de 20: " + nota20);
        System.out.println("Notas de 10: " + nota10);
        System.out.println("Notas de 5: " + nota5);
        System.out.println("Notas de 2: " + nota2);
        System.out.println("Notas de 1: " + nota1);
        
        sc.close();
    }
}

