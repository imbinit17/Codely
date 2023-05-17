/*
 *  Design a class decimalToBinary to accept a non-zero number in decimal format and convert it to binary.
    **Use of Strings and Arrays is prohibited. 
 */
import java.util.Scanner ; 
public class decimalToBinary
{ 
    private int decimal ; 
    void read() 
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number to be converted to Binary") ;
        decimal = sc.nextInt() ;
    }
    
    void perform()
    {
        int zeroCount = 0 ;
        int binary = 0 ;
        boolean flag = false ;
        while(decimal>0)
        {
            if(decimal%2==1)
            {
                binary += 1 ;
                binary*= 10 ;
                flag = true ;
                decimal = decimal/2 ;
            }
            else if(decimal%2==0 && binary!=0)
            {
                binary*= 10 ;
                flag =  false ;
                decimal = decimal/2 ;
            }
            
            else if(decimal%2==0 && binary==0)
            {
                decimal = decimal/2 ;
                zeroCount++ ;
            }
        }
        if(flag==true)
        binary/=10 ;
        
        System.out.print("Binary : ") ;
        while(binary!=0)
        {
            System.out.print(binary%10) ;
            binary /= 10 ;
        }
        for(int i=1;i<=zeroCount;i++)
        System.out.print("0") ;
    }
    
    public static void main(String args[])
    {
        decimalToBinary run = new decimalToBinary() ;
        run.read() ;
        run.perform() ;
    }
}         
