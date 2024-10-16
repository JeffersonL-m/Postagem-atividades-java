import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número com decimal (vírgula):");

        double num1 = scan.nextDouble();
        int convert_num1 = (int) num1;

        int novo_num = convert_num1 + 22;

        System.out.printf("%.2f convertido para inteiro e somado com 22 dará: %d", num1, novo_num);


        scan.close();
    }
}
