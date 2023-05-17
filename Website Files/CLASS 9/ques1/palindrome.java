/*
    Write a program to accept a number and check whether a number is palindrome or not
*/
import java.util.*;
class palindrome
{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        
        int temp=num;
        int newNum=0 ;
        
        int d;
        while(temp>0)
        {
            d=temp%10;
            newNum=(newNum*10)+d;
            temp=temp/10;
        }


        if(newNum==num)
        System.out.println(num+" is a palindrome number");      

        else 
        System.out.println(num+" is not a palindrome number");
    }
} 
