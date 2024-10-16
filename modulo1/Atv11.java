import java.util.Scanner;

public class Atv11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInsira um valor em metros:");

        double metros = scan.nextDouble();
        double alt_metros = metros * 100;

        System.out.printf("%.2f m em centímetros equivale a: %.2f cm", metros, alt_metros);

        

        scan.close();
    }
}
