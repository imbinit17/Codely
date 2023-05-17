/*  Define a class to declare a character array of size ten, accept the character into the array
    and perform the following:
        • Count the number of uppercase letters in the array and print.
        • Count the number of vowels in the array and print.
*/

import java.util.*;
public class caseCount
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        char arr[] = new char[10] ;

        System.out.println("Enter 10 characters") ;
        for(int i=0;i<10;i++)
        arr[i] = sc.nextLine().charAt(0) ;

        caseCount obj = new caseCount() ;
        obj.performTask(arr) ;
    }

    public void performTask(char arr[])
    {
        int uppercaseCount = 0 ;
        int lowercaseCount = 0 ;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]>='A' && arr[j]<='Z')
            uppercaseCount++ ;

            else if(arr[j]>='a' && arr[j]<='z')
            lowercaseCount++ ;
        }

        System.out.println("No of lowercase alphabets : "+lowercaseCount) ;
        System.out.println("No of uppercase alphabets : "+uppercaseCount) ;
    }
}