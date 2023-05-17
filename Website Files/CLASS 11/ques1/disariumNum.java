/*
 *     Write a class to accept a number and check whether the number is a Dissarium number or not .
 * 
 *      Sample Input : 175
 *      Explanation : 175 = 1^1 + 7^2 + 5^3
 */
import java.util.*;
public class disariumNum 
{
    public int function(int num)
    {
        int count = 0 ;
        int digit ;
        int sum = 0 ;
        int temp = num ;
        while(temp>0)
        {
            temp/=10 ;
            count++ ;
        }
    
        while(count>0)
        {
            digit = num%10 ;
            num/=10 ;
            sum+= (int)Math.pow(digit,count) ;
            count-- ;
        }
        return sum ;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number !") ;
        int number = sc.nextInt() ;
    
        disariumNum run = new disariumNum() ;
        int resultNum = run.function(number) ;
    
        if(resultNum==number)
        System.out.println(number+" is a Disarium Number ") ;
        
        else
        System.out.println(number+" is not a Disarium Number ") ;  
    }
}
