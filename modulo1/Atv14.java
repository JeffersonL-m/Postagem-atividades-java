import java.util.Scanner;

public class Atv14 {

    public static void imprimirMensagem(String nome){
        System.out.println("Olá " + nome + "! essa mensagem foi feita através de um método(função) em java!\n");
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nDigite seu nome: ");

        String nomecito = scan.nextLine();
        imprimirMensagem(nomecito);

        scan.close();
    }
}
