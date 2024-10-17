import java.util.Scanner;

public class Projeto1 {

    public static void calculadora(double numero1, double numero2){
        double calcSoma, calcSubtracao, calcMulti, calcDivi;

        calcSoma = numero1 + numero2;
        calcSubtracao = numero1 - numero2;
        calcMulti = numero1 * numero2;
        calcDivi = numero1 / numero2;

        System.out.println("Calculando com valores decimais:");
        System.out.printf("Resultado da operação: %.2f + %.2f = %.2f\n", numero1, numero2, calcSoma);
        System.out.printf("Resultado da operação: %.2f - %.2f = %.2f\n", numero1, numero2, calcSubtracao);
        System.out.printf("Resultado da operação: %.2f * %.2f = %.2f\n", numero1, numero2, calcMulti);
        System.out.printf("Resultado da operação: %.2f / %.2f = %.2f\n", numero1, numero2, calcDivi);
        System.out.println("");

        int convert_num1 = (int) numero1;
        int convert_num2 = (int) numero2;

        int calcSomaINT, calcSubtracaoINT, calcMultiINT, calcDiviINT;

        calcSomaINT = convert_num1 + convert_num2;
        calcSubtracaoINT = convert_num1 - convert_num2;
        calcMultiINT = convert_num1 * convert_num2;
        calcDiviINT = convert_num1 / convert_num2;

        System.out.println("Calculando com valores inteiros:");
        System.out.printf("Resultado da operação: %d + %d = %d\n", convert_num1, convert_num2, calcSomaINT);
        System.out.printf("Resultado da operação: %d - %d = %d\n", convert_num1, convert_num2, calcSubtracaoINT);
        System.out.printf("Resultado da operação: %d * %d = %d\n", convert_num1, convert_num2, calcMultiINT);
        System.out.printf("Resultado da operação: %d / %d = %d\n", convert_num1, convert_num2, calcDiviINT);

    }

    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String Nome = scan.nextLine();
        System.out.printf("Olá %s! bem vindo a calculadora simples!\n", Nome);
        System.out.println("Insira dois números contendo casas decimais.");

        double numero1, numero2;
        numero1 = scan.nextDouble();
        numero2 = scan.nextDouble();


        calculadora(numero1, numero2);


        scan.close();
    }
}
