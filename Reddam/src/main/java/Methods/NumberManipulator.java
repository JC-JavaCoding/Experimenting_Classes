/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

/**
 *
 * @author Jcj
 */
public class NumberManipulator
{
    public static void main(String[] args)
    {
        int hcf = hCF(150000, 15);
        System.out.println("HCF: "+ hcf);
    }
    
    public static int hCF(int num1, int num2)
    {
        int hcf = 0;
        
        int i = 0;
        int max = num2;
        if (num1 > num2)
        {
            max = num1;
        }
        for(i = 1; i <= num1; i++)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                hcf = i;
            }
        }
        return hcf;
    }
}
