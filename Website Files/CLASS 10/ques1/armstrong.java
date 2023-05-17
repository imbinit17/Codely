/*
 *  Write a class to check whether a given number is Armstrong or not using a function 
 *  name int checkArmstrong(int num). Function should return a value 1 if number is Armstrong 
 *  otherwise it return 0 if not.
 * 
 *  Example : 371
 */

import java.util.* ;
public class armstrong 
{
        
    public void check(int num)
    {
        int digit = 0 ;
        int sum = 0 ;
        int temp = num ;
        int temp2 = num ;
        int count  = 0 ;

        while(temp>0)
        {
            digit = temp%10 ;
            temp = temp/10 ;
            count++ ;
    
        } 
    
        for(int i = 1 ;i<=count;i++)
        {
           digit = temp2%10 ; 
           temp2 = temp2/10 ;
           sum = (int) (sum + 
           Math.pow(digit,count));
        }
             
           
        if(sum == num)
        System.out.println(num+" is a Armstrong number .") ;
    
        else
        System.out.println(num+" is not a Armstrong number .") ; 
    }
                  
    public static void main(String[] args)
    {
           Scanner sc = new Scanner(System.in) ;  
           System.out.println("Enter a number") ;     
           int num = sc.nextInt() ;
               
           armstrong run = new armstrong() ;
           run.check(num);
    }
}         