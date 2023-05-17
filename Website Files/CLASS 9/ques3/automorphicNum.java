import java.util.*;
public class automorphicNum
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int num=sc.nextInt();
    
        int sq=num*num;
        int temp=num;
        int count=0;
        while(temp>0)
        {
            count++;
            temp=temp/10;
        }
        int end=sq%(int)Math.pow(10,count);
        if(num ==end)
        {
            System.out.println(num+" is  an automorphic number");
    
        }
        else
        {
             System.out.println(num+" is not an automorphic number");
        }   
    }
}