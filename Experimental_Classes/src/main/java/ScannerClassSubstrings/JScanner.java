/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassSubstrings;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class JScanner
{
    private String s;
    private char delimeter = ' ';
    private int currentPos = 0;
    public static void main(String[] args)
    {
        String s = JOptionPane.showInputDialog("Enter string");
        JScanner js = new JScanner(s);
        
        System.out.println("Next: "+ js.next());// +"\nNextInt: "+ nextInt());
        System.out.println("NextInt: "+ js.nextInt());
        //Hello Dar21kness my 133 old4 friend
    }
    public JScanner(String inputS)
    {
        s = inputS;
    }
    public void setDelimeter(char d)
    {
        delimeter = d;
    }
    public String next()
    {
        String nextCharSet = "";
        
       if (s.contains("" +delimeter))
        {
            nextCharSet = s.substring(0, s.indexOf(delimeter));
            s = s.substring(s.indexOf(delimeter) +1);
        }
       
        return nextCharSet;
    }
    public int nextInt()
    {
        String nextNumStr = "";
        int foundInts = 0;
        int startPos = currentPos;
        char currChar;
        int [] intIndx = findIntIndecies();

            currChar = s.charAt(intIndx[currentPos]);
            while (Character.isDigit(currChar))
            {
                nextNumStr += currChar;
                currentPos += 1;
                currChar = s.charAt(currentPos);
             }
            s = s.substring(currentPos+1);
// hello 12 darkn4ss 7m8 fr13nd
        
        return Integer.parseInt(nextNumStr);
    }
    private int [] findIntIndecies()
    {
        int [] indArr = {};
        int numInts = 0;
        int secondPos = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar)) 
            {
                numInts++;
            }
        }
        indArr = new int[numInts];
        for (int i = 0; i < s.length(); i++)
        {
             char currChar = s.charAt(i);
            if(Character.isDigit(currChar)) 
            {
                indArr [secondPos] = i;
                secondPos++;
            }
        }
        return indArr;
    }
    //setDelimeter
    //next()
    //nextInt()
    //nextDouble()
    
    
    
}
