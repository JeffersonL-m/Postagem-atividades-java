import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.err.printf("\n");
        System.out.println("Insira três números para calcular sua média aritmética e verificar se é maior que 50:");

        double num1, num2, num3, media;

        num1 = scan.nextDouble();
        num2 = scan.nextDouble();
        num3 = scan.nextDouble();

        media = (num1 + num2 + num3) / 3;

        if(media > 50){
            System.err.println("True.\n");

        } else if(media == 50){
            System.err.println("É exatamente igual a 50.\n");
        } else{
            System.err.println("False.\n");
        }

        scan.close();
    }
}
