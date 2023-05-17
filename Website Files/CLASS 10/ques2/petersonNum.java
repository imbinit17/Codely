/*
 *  Design a class PetersonNum to check whether a number is a Peterson number or not
 *  Given Number: 145
    = 1 + (4*3*2*1)+(5*4*3*2*1)
    = 145
 */
import java.util.Scanner ;
class PetersonNum 
{
    private static int num ;
    PetersonNum(int n)
    {
        num = n ;
    }
    
    static int factorial(int n )
    {
        int result = 1 ;
        for(int i=n;i>0;i--)
        result *= i ;
        
        return result ;
    }
    
    void display()
    {
        int temp = num ;
        int newNum = 0 ;
        while(num!=0)
        {
            newNum += factorial(num%10) ;
            num/= 10 ;
        }
        if(temp==newNum)
        System.out.println(temp+" is a Peterson Number !") ;
        
        
        else 
        System.out.println(temp+" is not a Peterson Number ") ;
        
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number ") ;
        PetersonNum run = new PetersonNum(sc.nextInt()) ;
        run.display() ;
    }
}