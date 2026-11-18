import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.print("Digite um ano: ");
       int year = sc.nextInt();
       
       if ((year %4 == 0 && year %100 != 0) || (year % 400 == 0)) {
    	   System.out.println("Ano bissexto");
        
       } else {
    	   System.out.println("Ano não é bissexto");
       }

        sc.close();
    }
}