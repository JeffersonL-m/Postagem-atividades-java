import java.util.Scanner;
public class CalculaIMC {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double Peso;
        double Altura;
        String Nome;

        System.out.println("Digite seu peso:");
        Peso = scan.nextDouble();
        System.out.println("Digite a sua altura:");
        Altura = scan.nextDouble();
        System.out.println("Digite seu nome:");
        scan.nextLine();
        Nome = scan.nextLine();
        String Classificacao;

        double IMC = Peso / (Altura*Altura);

        if(IMC >= 40){
            Classificacao = "Obesidade muito severa (grau III)";
        } else if(IMC >= 35 && IMC <= 39.9){
            Classificacao = "Obesidade severa (grau II)";
        } else if(IMC >= 30 && IMC <= 34.9){
            Classificacao = "Obesidade moderada (grau I)";
        } else if(IMC >= 25 && IMC <= 29.9){
            Classificacao = "Pré-obesidade";
        } else if(IMC >= 18.5 && IMC <= 24.9){
            Classificacao = "Eutrofia";
        } else if(IMC >= 17 && IMC <= 18.4){
            Classificacao = "Magreza grau I";
        } else if(IMC >= 16 && IMC <= 16.9){
            Classificacao = "Magreza grau II";
        } else{
            Classificacao = "Magreza grau III";
        }

        System.out.printf("%s, seu IMC é %.2f, %s", Nome, IMC, Classificacao);

        scan.close();
    }
}
