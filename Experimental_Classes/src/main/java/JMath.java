public class JMath
{
   //initiate required variables to be used in the methods
   //for adding method:
   private int numToAdd = 0;
   private int addedNumValue = 0;
   //for multiplying method:
   private double squaredNum = 0;
      
   public int addOneToNum(int addToThisNum)
   {
     numToAdd = addToThisNum;
     addedNumValue = numToAdd + 1;
     return addedNumValue;
   }
   
   public double square(double numToSquare)
   {
      squaredNum = numToSquare * numToSquare;
      return squaredNum;
   }

}