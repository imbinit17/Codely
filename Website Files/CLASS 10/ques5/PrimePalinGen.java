/*
 *  Design a class PrimePalinGen to generate prime palindrome numbers.
    [ A number is said to be prime palindrome if the number is a prime as well as a palindrome number]
 */
import java.util.*; 
public class PrimePalinGen
{
    int start , end ;
    PrimePalinGen(int a ,int b)
    {
        start = a ;
        end = b ;
    }
    
    int isPrime(int i)
    {
        for(int j=2;j< i;j++)
        {
            if(i%j==0)
            return 0 ;
        }
        return 1 ;
    }
    
    int isPalin(int i)
    {
        int num = i ;
        int newNum = 0 ;
        while(i!=0)
        {
            newNum = newNum + (i%10) ;
            newNum *= 10 ;
            i = i/10 ;
        }
        
        if((newNum/10)==num)
        {
            return 1 ;
        }
        
        else 
        return 0 ;
    }
    
    void generate()
    {
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i)==1)
            {
                if(isPalin(i)==1)
                System.out.println(i) ;
            }
        }
    }
    
    public static void main(String  args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter start range");
        int start = sc.nextInt() ;
        System.out.println("Enter end range") ;
        int end = sc.nextInt() ;
        
        PrimePalinGen run = new PrimePalinGen(start,end) ;
        run.generate() ;
    }
}        