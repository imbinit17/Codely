/*
 *      Write a program to compute the Compound Interest to be compounded annually 
 *      but DON'T USE FORMULA
 */
import java.util.* ;
class compoundInterest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the principal amount") ;
        double principal = sc.nextDouble() ;
        
        System.out.println("Enter the rate of interest per annum") ;
        double rate = sc.nextDouble() ;

        System.out.println("Enter the time period in years") ;
        int time = sc.nextInt() ;

        compoundInterest run = new compoundInterest() ;
        
        double amount = run.getAmount(principal,rate,time) ;
        double CI = amount - principal ;

        System.out.println("The Compound Interest : "+Math.round(CI)) ;
        System.out.println("The final Amount : "+Math.round(amount)) ;
    }

    public double getAmount(double p , double r ,double t) //p->principal ; r->rate ;t->time
    {
        double amount = p ; //Compound Interest
        for(int i=1;i<=t;i++)
        {
            amount =  amount + (amount*r*1)/100 ;
        }
        return amount ;
    }

}