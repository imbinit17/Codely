/*
	Write a program to arange a string sentence in alphabetical order

	Sample Input : 
	Raman was running after an elephant
	
	Output : 
	after an elephant Raman running was
*/

import java.util.*;
public class arrangeWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter sentence") ;
        String str = sc.nextLine() ;

        arrangeWords obj = new arrangeWords() ;
        String arr[] = obj.separateWords(str) ;
        System.out.println(Arrays.toString(arr)) ;
        
        arr = obj.arrangeArray(arr) ;
        
	for(int n=0;n<arr.length ;n++)
	System.out.print(arr[n]+" ") ;
    }

    public String[] arrangeArray(String[] arra)
    {
        String[] arr = arra ;
        //bubblesort algorithm
        for(int a=0;a<arr.length;a++)
        {
            for(int b=0;b<arr.length-1;b++)
            {
                if(precedenceCheck(arr[b],arr[b+1])==-1) // if arr[b+1] preceeds arr[b]
                {
                    String temp = arr[b+1] ;
                    arr[b+1] = arr[b] ;
                    arr[b] = temp ;
                }
            }
        }
        return arr ;
    }

    public static String[] addToArray(String[] arr,String word)
    {
        String[] newArr = new String[arr.length+1] ;
        for(int j=0;j<arr.length;j++)
        newArr[j] = arr[j] ;

        newArr[arr.length] = word ;
        return newArr ;
    }

    public String[] separateWords(String str)
    {
        String[] arr = new String[1] ;
        str = " " + str  + " " ;
        String word = "" ;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==' '&&str.charAt(i)!=' ')
            {
                while(str.charAt(i)!=' ')
                {
                    word += str.charAt(i) ;
                    i++ ;
                }
                arr = addToArray(arr, word) ;
                word = "" ;
            }
        }

        String newArr[] = new String[arr.length-1] ; //eliminating null
        for(int k=1;k<arr.length;k++)
        newArr[k-1] = arr[k] ;

        return newArr ;
    }

    public static int precedenceCheck(String str1,String str2)
    {
        str1 = str1.toLowerCase() ;
        str2 = str2.toLowerCase() ;
        int len1 = str1.length() ;
        int len2 = str2.length() ;

        //flag -1 defines str2 before str1
        //flag -2 defines str1 before str2
        int flag =0 ;
        char ch1 ,ch2 ;
        while(flag>=0 && flag<Math.min(len1,len2))
        {
            ch1 = str1.charAt(flag) ;
            ch2 = str2.charAt(flag) ;

            if((int)ch1>(int)ch2)
            flag = -1 ;
            
            else if((int)ch1<(int)ch2)
            flag = -2 ;
            
            else if((int)ch1==(int)ch2)
            flag++ ;
        }
        
        if(flag==Math.min(len1,len2))
        {
            if(len1>=len2)
            flag = -1 ;
            
            else if(len1<len2)
            flag = -2 ;
        }
        return flag ;
    }
}