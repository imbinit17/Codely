/*
 *  Write a program to accept a number and check whether it is a tech number or not 
 * 
 *  --->A number is called a tech number if the given number has an even number of digits
 *       and the number can be divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum.

    Sample Input : 2025

 */
import java.util.Scanner;
class TechNum
{
    private static int num ;
    
    static int digitCheck()
    {
        int n = num ;
        int digitCount = 0 ;
        while(n>0)
        {
            n/= 10 ;
            digitCount ++ ;
        }
        return digitCount ;
    }
    
    static void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number") ;
        num = sc.nextInt() ;
    }
    
    static void display()
    {
        int digits = digitCheck() ;
        if(digits%2==0)
        {
            int temp = num ; 
            int divisor = (int)Math.pow(10,digits/2) ;
            int firstHalf = temp%divisor ;
            int secondHalf =  temp/divisor ;
            int sum = firstHalf + secondHalf ;
            System.out.println("sum"+sum) ;

            if((sum*sum)==num)
            System.out.println(num+" is a Tech Number") ;
            
            else 
            System.out.println(num+" is not a Tech Number") ;
        }
        else
        System.out.println("Number does not have even number of digits") ;
    }
    
    public static void main(String args[])
    {
        input() ;
        display() ;
    }
}       