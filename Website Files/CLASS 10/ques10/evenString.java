/*
 *  Define a class to accept and store 10 strings into the array and print the strings with even
    number of characters.
    Note : even no of CHARACTERS does not mean if length of string is even 
    It means whether the no of characters(spaces don't count) are even 
*/
import java.util.*;
class evenString
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        evenString tool = new evenString() ;

        String arr[] = new String[10] ;
        System.out.println("Enter 10 sentences") ;

        String newArr[] = new String[10] ;
        int index = 0 ;
        for(int j=0;j<10;j++)
        {
            arr[j] = sc.nextLine() ;
            newArr[j] = tool.eliminateSpaces(arr[j]) ;

            if(newArr[j].length()%2==0)
            {
                index*=10 ;
                index+=j ;
            }
        }
        System.out.println("") ;
        System.out.println("The following are the even strings") ;
        while(index!=0)
        {
            System.out.println(arr[index%10]) ;
            index /= 10 ;
        }
    }

    public String eliminateSpaces(String str)
    {
        String newStr="" ;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            newStr +=str.charAt(i) ;
        }
        return newStr ;
    }
}
