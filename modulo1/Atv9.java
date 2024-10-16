import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nInsira sua idade.");

        int idade;
      
        idade = scan.nextInt();
        scan.nextLine();


        int ternaria = (idade >= 16 && idade <= 18) ? 1 : 0;
        
        
        if(ternaria == 0){
            if(idade > 65){
                System.out.println("True\n");
            } else{
                System.out.println("False\n");
            }
        } else{
            System.out.println("True\n");
        }

        scan.close();
    }
}
