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
public class UseJScanner
{
    public static void main(String[] args)
    {
        String s = JOptionPane.showInputDialog("Enter string");
        JScanner js = new JScanner(s);
        
        System.out.println("Next: "+ js.next());// +"\nNextInt: "+ nextInt());
        System.out.println("NextInt: "+ js.nextInt());
        //Hello Dar21kness my 133 old4 friend
    }
}
