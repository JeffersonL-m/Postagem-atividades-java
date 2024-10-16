import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInsira dois números reais:");

        double num1, num2;

        num1 = scan.nextDouble();
        num2 = scan.nextDouble();

        System.out.printf("A soma dos dois números é: %.2f\n\n", (num1+num2));

        scan.close();
    }
}
