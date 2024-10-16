import java.util.Scanner;

public class Atv15 {
    
    public static void calcularArea(char opcao, double valor){
       
        double quadrado_valor = valor * valor;
        double PI = 3.1415;
        double calculo;

        if(opcao == 'C' || opcao == 'c'){
            calculo = PI * quadrado_valor;
            System.out.printf("A área da circunferência é aproximadamente igual a: %.2f m²", calculo);

        } else{
            calculo = quadrado_valor;
            System.out.printf("A área do quadrado é aproximadamente igual a: %.2f m²", calculo);
        }
    }



    public static void main(String[] args) {
        System.out.println("\nPara calcular a área de um círculo digite C, para a de um quadrado digite Q:");
        Scanner scan = new Scanner(System.in);
        
        double valor;
        char opcao = scan.next().charAt(0);

        if(opcao == 'C' || opcao == 'c'){
            System.out.println("Insira a medida de seu raio, em metros.");
            valor = scan.nextDouble();

            calcularArea(opcao, valor);

        } else if(opcao == 'Q' || opcao == 'q'){
            System.out.println("Insira o comprimento do lado do quadrado, em metros.");
            valor = scan.nextDouble();

            calcularArea(opcao, valor);

        } else{
            System.out.println("Erro! entrada inválida.");
            return;

        }
        

        scan.close();
    }
}
