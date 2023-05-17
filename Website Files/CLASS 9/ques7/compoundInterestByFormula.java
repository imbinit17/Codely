/*
 *      Write a program to calculate Compound Interest and the Amount by using the formula
 *      Amount = P*(1+(r/n))^nt
 *      Compound Interest = Amount - Principal
 */

import java.util.*;
class compoundInterestByFormula
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in) ; 
        System.out.println("Enter the principal amount") ;
        double principal = sc.nextDouble() ;
        
        System.out.println("Enter the rate of interest") ;
        double rate = sc.nextDouble() ;

        System.out.println("Enter the no. of times the interest is compounded in a year") ;
        double n = sc.nextDouble() ;

        System.out.println("Enter the time period in years") ;
        double time = sc.nextDouble() ;

        double amount = principal*Math.pow((1+(rate/(n*100))),(n*time)) ;
        double CI = amount - principal ;

        System.out.println("Final amount : "+Math.round(amount)) ;
        System.out.println("Total Compound Interest : "+Math.round(CI)) ;
    }
}