import java.util.Scanner;


public class Atv5_incremento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num1, num2, aux_num1, aux_num2;

        System.out.printf("Insira dois números inteiros, o primeiro para ser incrementado e o segundo para ser decrementado:\n");

        num1 = scan.nextInt();
        num2 = scan.nextInt();

        aux_num1 = num1;
        aux_num2 = num2;

        System.out.printf("%d incrementando torna-se: %d\n", aux_num1, ++num1);
        System.out.printf("%d decrementado  torna-se: %d\n", aux_num2, --num2);
        

        scan.close();
    }
}
