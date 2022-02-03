/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassSubstrings;

/**
 *
 * @author Jcj
 */
public class JScanner
{
    private String s;
    private char delimeter = ' ';
    private int currentPos = 0;
    
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
        
        for (; currentPos < s.length(); currentPos++)
        {
            char c = s.charAt(currentPos);
            if(c == delimeter) break;
            nextCharSet += c;
            nextCharSet += s.substring(0, currentPos);
        }
        
        return nextCharSet;
    }
    public int nextInt()
    {
        int nextNum = 0;
        int foundInts = 0;
        int startPos = currentPos;
        for (; currentPos < s.length(); currentPos++)
        {
            if(s.charAt(currentPos) == delimeter && foundInts != 0) break;
            else if (Character.isDigit(s.charAt(currentPos)))
            {
                nextNum += (int)s.charAt(currentPos);
                foundInts ++;
            }
        }
        
        return nextNum;
    }
    //setDelimeter
    //next()
    //nextInt()
    //nextDouble()
    
    
    
}
