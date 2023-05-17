/*
 * Define a class to declare an array of size twenty of double datatype, 
 * accept the elements into the array and perform the following:
        Calculate and print the product of all the elements.
        Print the square of each element of the array. [10]
 */
// ICSE 2022 question

import java.util.*;
class productAndSquare
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;

        double arr[] = new double[20] ;
        System.out.println("Enter 20 numberals") ;

        for(int i=0;i<20;i++)
        arr[i] = sc.nextDouble() ;

        productAndSquare obj = new productAndSquare() ;
        obj.product(arr) ;
        obj.square(arr) ;
    }

    public void square(double arr[])
    {
        for(int k=0;k<arr.length;k++)
        {
            System.out.println("Product of : "+arr[k]) ;
            System.out.println(arr[k]*arr[k]) ;
        }
    }

    public void product(double arr[])
    {
        double result = 1 ;
        for(int m=0;m<arr.length;m++)
        result *= arr[m] ;

        System.out.println("Product of no.s of array: "+result) ;
    }
}