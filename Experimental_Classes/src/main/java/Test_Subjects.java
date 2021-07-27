
import javax.swing.JOptionPane;

public class Test_Subjects
{
   public static String multipleIfs(String msg)
   {  //this is for combined if statement
      String encrypted = "";
            
      for(int i = 0; i< msg.length(); i++)
      {
         int intCharValue1 = (int)msg.charAt(i);
         
         if((int)msg.charAt(i) == 71 && (int)msg.charAt(i+1) == 111 && (int)msg.charAt(i+2) == 100)
         {// vir: "God"
            encrypted += 777;
            i += 2; 
         }
         else if((int)msg.charAt(i) == 74 && (int)msg.charAt(i+1) == 101 && (int)msg.charAt(i+2) == 115 && (int)msg.charAt(i+3) == 117 && (int)msg.charAt(i+4) == 115)
         { //for word "Jesus"
            encrypted += "[" + (char) 65 + (char) 234 + "]";
            i += 4;
         }
         else if( ((int)msg.charAt(i) == 68 || (int)msg.charAt(i) == 100) && (int)msg.charAt(i+1) == 117 && (int)msg.charAt(i+2) == 105 && (int)msg.charAt(i+3) == 119 && (int)msg.charAt(i+4) == 101 && (int)msg.charAt(i+5) == 108)
         {  //vir: "Duiwel"/ "duiwel"
            encrypted += 666;
            i +=5;
         }
         else if((int)msg.charAt(i) == 86 && (int)msg.charAt(i+1) == 97 && (int)msg.charAt(i+2) == 100 && (int)msg.charAt(i+3) == 101 && (int)msg.charAt(i+4) == 114)
         {// vir: "Vader"
            encrypted += 1;
            i += 4;
         }
         else if((int)msg.charAt(i) == 83 && (int)msg.charAt(i+1) == 101 && (int)msg.charAt(i+2) == 117 && (int)msg.charAt(i+3) == 110)
         {// vir: "Seun"
            encrypted += 2;
            i += 3;
         }
         else if((int)msg.charAt(i) == 72 && (int)msg.charAt(i+1) == 101 && (int)msg.charAt(i+2) == 105 && (int)msg.charAt(i+3) == 108 && (int)msg.charAt(i+4) == 105 && (int)msg.charAt(i+5) == 103 && (int)msg.charAt(i+6) == 101 && (int)msg.charAt(i+7) == 32 && (int)msg.charAt(i+8) == 71 && (int)msg.charAt(i+9) == 101 && (int)msg.charAt(i+10) == 101 && (int)msg.charAt(i+11) == 115)
         {// vir:Heilige Gees
            encrypted += 3;
            i += 10;
         }         
         else
         {
            encrypted += msg.charAt(i);
         }
      }
      
      return encrypted;
   }
   public static void main(String[] intellectuals)
   {
      
      String input = JOptionPane.showInputDialog("Type here:");
//       System.out.println(input);
      
      String messageResult = multipleIfs(input);
      System.out.println(messageResult);
   }
}