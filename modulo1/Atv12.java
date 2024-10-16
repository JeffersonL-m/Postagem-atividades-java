// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Atv12 {
   public Atv12() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Digite um n\u00famero com decimal (v\u00edrgula):");
      double var2 = var1.nextDouble();
      int var4 = (int)var2;
      System.out.printf("A parte inteira sem as casas decimais \u00e9: %d", var4);
      var1.close();
   }
}
