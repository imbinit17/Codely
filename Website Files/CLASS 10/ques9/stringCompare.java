/*
    Define a class to accept two strings, convert them into uppercase, check and display
    whether two strings are equal or not, if the two strings are not equal, print the string with
    the highest length or print the message both the strings are of equal length.
 */
import java.util.*;
class stringCompare
{
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Type two sentences !") ;
        String str1 = sc.nextLine().toUpperCase() ; 
        String str2 = sc.nextLine().toUpperCase() ;

        if(str1.equals(str2)==true)
        System.out.println("Strings Equal") ;
        
        else
        {
            System.out.println("Unequal Strings") ;

            if(str1.length()>str2.length())
            System.out.println(str1) ;

            else if(str2.length()>str1.length())
            System.out.println(str2) ;

            else if(str1.length()==str2.length())
            System.out.println("Same Length") ;
        }
   }   
}