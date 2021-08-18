import javax.swing.JOptionPane;

public class Own_Packets
{
   public static void main(String[] args)
   {
      System.out.println("This is my attempt at creating my own package and running it in one code (multiple classes run in one)");
      int numToAdd = 4;
      Add_One_To_Nr addedNum = new Add_One_To_Nr();   
      int finalValue = addedNum.addOneToNum(numToAdd);
      System.out.println("This is the final value:"+ finalValue +" (original was 4)");
      
      //For squaring a number:
      JMath numberToSquare = new JMath();   
      String strNumToSquare = JOptionPane.showInputDialog("Type a number you want to square here: ");
      double numToSquare = Double.parseDouble(strNumToSquare);
      double squaredNum = numberToSquare.square(numToSquare);
      System.out.println("This is the squared number: "+ squaredNum);
      
   }
}