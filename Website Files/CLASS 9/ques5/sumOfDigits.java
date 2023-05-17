/*
 * Write a program to print the sum of negative numbers , sum of odd positive numbers and sum of even positive numbers from a list of numbers entered by user .The list terminates when the user enters a zero .
Note : Avoid array as out of scope of the ICSE class IX syllabus
 */
import java.util.* ;
class sumOfDigits
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Start entering the numbers .Press 0 to terminate") ;

        int num = 1 ;
        int sumNegative = 0 ;
        int sumOddPositive = 0 ;
        int sumEvenPositive = 0 ;
        while(num!=0){
            num = sc.nextInt() ;
            if(num<0)
            sumNegative += num ;

            else{
                if(num%2==0)
                sumEvenPositive += num ;

                else if(num%2!=0)
                sumOddPositive += num ;
            }
        }
        System.out.println("Sum of Odd Positive nos "+sumOddPositive) ;
        System.out.println("Sum of Even Positive nos "+sumEvenPositive) ;
        System.out.println("Sum of Negative nos "+sumNegative) ;
    
    }
}