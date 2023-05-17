/*
 * Write a program to accept a number and check whether it is a special number or not .
 */
import java.util.* ;
class specialNum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number") ;
        int num = sc.nextInt() ;

        int temp = num ;
        int x ;
        int factorial = 1;
        int sum = 0 ;
        while(temp>0)
        {
            x = temp%10 ;
            for(int i=x;i>0;i--)
            factorial *= i ;
            sum += factorial ;
            factorial = 1 ;
            temp/=10 ;
        }

        if(sum==num)
        {
            System.out.println("Special Number");    
        }
        else
        {
            System.out.println("Not a Special Number ") ;
        }
    }
}