/*
 *  Write a program in Java to calculate the permutative rank of a word.
 *  (For what a permutative rank of a word is; please refer to Permutations & Combinations)

     Sample Input           Sample Output
        CAB                     5
        DELHI                   5
        RANK                    20
        ALLAHABAD               3891
 */

import java.util.*;
class permutativeRankCalculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a word") ;
        String word = sc.next().toUpperCase() ;

        permutativeRankCalculator run = new permutativeRankCalculator() ;
        
        String arranged = run.arrangeAlphabetically(word) ;

        int rank = run.rankCalculator(word, arranged) ;
        System.out.println("The rank of the word "+word+" is "+rank) ;
    }

    public int rankCalculator(String word,String arranged)
    {
        int len = word.length() ;
        int index ; //formula variable
        char ch ; 
        int remaining ,repitition ; //formula variable
        int rank = 0 ; //this will be returned
        for(int f=0;f<len;f++)
        {
            ch = word.charAt(f) ;
            index = arranged.indexOf(ch) ;
            repitition = repititionCheck(arranged) ; 
            arranged = eliminateCharacter(arranged,ch) ;
            remaining = factorial(len-(f+1)) ;
            
            rank += index * (remaining)/repitition ;
        }
        //At last when 0 is returned ; but for successful completion +1 rank is rewarded ....
        return (rank+1) ;
    }

    public String arrangeAlphabetically(String str)
    {
        Character arr[] = new Character[str.length()] ;
        for(int b=0;b<arr.length;b++)
            arr[b] = str.charAt(b) ;
        
        char ch ;
        for(int c=0;c<arr.length;c++)
       {
        for(int d=0;d<arr.length-1;d++)
        {
           if((int)arr[d]>(int)arr[d+1])
            {
                ch = arr[d] ;
                arr[d] = arr[d+1] ;
                arr[d+1] = ch ;
            }
        }
        }
        String resultStr = "" ;
        for(int e=0;e<arr.length;e++)
        resultStr += arr[e] ;
        
        return resultStr ;
    }

    public static String eliminateCharacter(String arranged ,char ch)
    {
        String newStr = "" ;
        int flag = 0 ; //to keep check only 1 character 'ch' is eliminated (and not multiple 'ch' are eliminated)
        for(int g=0;g<arranged.length();g++)
        {
            if(arranged.charAt(g)==ch && flag==0)
            {
                flag++ ;
            }
            else
            newStr += arranged.charAt(g) ;
        }
        return newStr ;
    }

    public static int factorial(int n)
    {
        int product = 1 ;
        for(int a=n;a>0;a--)
        product *= a ;
        return product ;
    }

     // NOTE- This function calls various static methods ...thus important one
     public static int repititionCheck(String arranged)
     {
        Character arr[] = distributeCharacters(arranged) ;
        
        char ch ;
        int result = 1 ;
        int temp ;
        for(int k=0;k<arr.length;k++)
        {
            temp = 0 ;
            ch = arr[k] ;
            for(int l=0;l<arranged.length();l++)
            {
                if(ch==arranged.charAt(l))
                temp++ ;
            }
            result *= factorial(temp) ;
        }
         return result ;
     }

     public static Character[] distributeCharacters(String arranged)
     {
        Character arr[] = new Character[arranged.length()] ;
        char ch ;
        int arrIndex = 0 ;
        for(int h=0;h<arranged.length();h++)
        {
            ch = arranged.charAt(h) ;
            if(doesExist(arr,ch)==false)
            {
                arr[arrIndex] = ch ;
                arrIndex++ ;
            }
        }
        Character finalArr[] = new Character[arrIndex] ;
        for(int i=0;i<arrIndex;i++)
        finalArr[i] = arr[i] ;

        return finalArr ;
     }

     public static boolean doesExist(Character arr[],char ch)
     {
        boolean flag = false ;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=null && arr[j]==ch)
            flag = true ;
        }
        return flag ;
     }
}