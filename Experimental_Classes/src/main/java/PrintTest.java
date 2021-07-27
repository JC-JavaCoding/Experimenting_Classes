import java.lang.Math;

public class PrintTest
{
   public static void main(String [] args)
   {
      double total = 0;
      for (int n = 1; n < 16; n++)
      {
         double numeratorFormula = 4 * (Math.pow(n, 2)) - 4*n + 1;
         double denominatorFormula = 4*(Math.pow(n, 2));
         double termsTotal = numeratorFormula / denominatorFormula;
         total += termsTotal;
         System.out.println("Question 3.3: "+ total);
      }
   }
}