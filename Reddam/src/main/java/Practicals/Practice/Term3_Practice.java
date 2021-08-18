/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practicals.Practice;

import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class Term3_Practice
{
    public static void main(String[] args)
    {
        int highestNum = 0;
        int lowestNum = 0;
        int total = 0;
        double avg = 0;
        for (int i = 0; i < 10; i++)
        {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            if (number > highestNum)
            {
                highestNum = number;
            }
            if (i == 0)
            {
                lowestNum = number;
            }
            else if (lowestNum > number) 
            {
                lowestNum = number;
            }
            total += number;
            
        }
        avg  = total/ 10.0;
        System.out.println("Highest: "+ highestNum +", Lowest: "+ lowestNum +", avg: "+ avg);
    
        
    }
    
    
}
