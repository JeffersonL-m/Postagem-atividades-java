import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome;
        
        System.out.printf("\nEscreva seu nome: ");
        
        nome = scan.nextLine();

        System.out.printf("\nOlá %s! essa é uma mensagem personalizada de boas-vindas!\n\n", nome);


        scan.close();
    }
}
