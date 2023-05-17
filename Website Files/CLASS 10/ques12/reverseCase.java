/*
 *   Define a class to accept a string and print the characters with the uppercase and lowercase ,
 *   but all other characters remain same
 */
import java.util.*;
class reverseCase
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a sentence ") ;
        String str = sc.nextLine() ;

        String newStr="" ;
        int temp = 0 ;
        for(int i=0;i<str.length();i++)
        {
            temp = (int) str.charAt(i) ;
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                temp += 32 ;
                newStr += (char) temp ;
            }

            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                temp -= 32 ;
                newStr += (char) temp ;
            }

            else
            newStr += str.charAt(i) ;
        }

        System.out.println(newStr) ;
    }
}