import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("\nInsira um número inteiro:\n");

        int num;
        num = scan.nextInt();

        System.out.println("Seu número é: " + num);

        scan.close();

    }
}
