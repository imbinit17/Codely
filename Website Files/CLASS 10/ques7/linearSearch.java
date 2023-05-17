/*
    Define a class to declare an integer array of size n and accept the elements into the array.
    Search for an element input by the user using linear search technique, display the element
    if it is found, otherwise display the message “NO SUCH ELEMENT.
 */

 import java.util.*;
 class linearSearch
 {
    public static void main(String[] args) 
    {
        linearSearch obj = new linearSearch() ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the no. of entries to be made") ;
        int n = sc.nextInt() ;

        int arr[] = new int[n] ;

        System.out.println("Enter "+n+" numbers !") ;
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt() ;

        System.out.println("Enter the number to be searched");
        int num = sc.nextInt() ;
        obj.checkForEntry(arr,num);          
    }

    public void checkForEntry(int arr[],int num)
    {     
        int flag = -1 ;
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]==num)
            {
                flag = j ;
                j = arr.length ;
            }
        }

        if(flag==-1)
        {
            System.out.println("No such element found") ;
        }

        else
        {
            System.out.println("Number found at index : "+flag) ;
        }
    }
 }