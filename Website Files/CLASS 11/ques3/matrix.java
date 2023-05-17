/*
       Define a class matrix with the following specifications :- 
       Data Members : 
           int m,n --> stores dimensions of array
           arr[][] = array to store the numeric elements
  
       Member Methods : 
           matrix(int r,int c) : constructor to initialise m and n for allocating memory for array
           void getData() : method to get Values for the array from the user
           void sort() : method to sort the array in ascending order using a standard sorting technique(row)
           void show() : method to display array in matrix form
       
       Also write main method to implement above functions.
 */

import java.util.*;
public class matrix
{
    int m ,n ;
    int arr[][] ;
    matrix(int r,int c)
    {
        m = r ;
        n = c ;
        arr= new int[m][n] ;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Rows for the matrix") ;
        int r = sc.nextInt();
        System.out.println("Columns for the matrix") ;
        int c = sc.nextInt() ;
        
        matrix run = new matrix(r,c) ;
        System.out.println("Enter "+r*c+" characters .");
        run.getData() ;
        run.sort();
        run.show() ;
    }
    
    void show ()
    {
        for(int x=0;x<m;x++)
        {
            for(int y=0;y<n;y++)
            System.out.print(arr[x][y]+" ") ;
            System.out.println() ;
        }
    }
    void sort()
    {
        int tempArr[] = new int[n] ;
        for(int a=0;a<m;a++)
        {
            for(int b=0;b<n;b++)
            tempArr[b] = arr[a][b] ;
            
            tempArr = bubbleSort(tempArr) ;
            for(int c=0;c<n;c++)
            arr[a][c] = tempArr[c] ;
        }
    }
    
    void getData()
    {
        Scanner sc = new Scanner(System.in) ;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            arr[i][j] = sc.nextInt() ;
        }
    }
    
    public static int[] bubbleSort(int arr[])
    {
        int temp ;
        for(int i=0;i<arr.length ;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }
        return arr ;
    }
}