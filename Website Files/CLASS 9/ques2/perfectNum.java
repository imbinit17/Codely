/*
 * Write a program to accept a number and check whether the number is a Perfect Number or not
 */

import java.util.*;
class perfectNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp = num ;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==temp)
            System.out.println(temp+"  is a perfect number");

        else
            System.out.println(temp+"  is  not a perfect number");
    }
}