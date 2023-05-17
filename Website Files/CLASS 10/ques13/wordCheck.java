/*
 *      Define a class to declare an array to accept and store ten words .
 *      Display only those words which start with 'A' or 'a' .
 */
import java.util.*;
class wordCheck
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        String arr[] = new String[10] ;
        System.out.println("Enter 10 words") ;
        
        for(int i=0;i<arr.length;i++)
        arr[i] = sc.next() ;

        System.out.println("The words are : ") ;
        for(int j=0;j<arr.length;j++)
        {
            if(doesSatisfy(arr[j])==true)
            System.out.println(arr[j]) ;
        }
    }

    public static boolean doesSatisfy(String word)
    {
        boolean flag = false ;
        char ch = word.charAt(0) ;
        if(ch=='A' || ch=='a')
        flag = true ;
        
        return flag ;
    }

}