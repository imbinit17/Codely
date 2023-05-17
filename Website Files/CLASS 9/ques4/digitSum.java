/*
 * Write a program to compute sum of digits of a number entered by the user .
 */
import java.util.*;
class digitSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            int d=num%10;
            sum=sum+d;
            num=num/10;
        }
        System.out.println("The sum of digits is "+sum);
    }
} 
