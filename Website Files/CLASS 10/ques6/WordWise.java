/*
 *  Design a class WordWise to separate words from a sentence and find the frequency of
 *  the vowels in each word.
 * 
    Define the class WordWise giving details of the constructor(), void readsent(),
     int freq vowel(String) and void arrange(). Define the main() function to create
      an object and call the functions accordingly to enable the task.
 */
import java.util.*;
public class WordWise
{
    private String str ;
    
    WordWise()
    {
        str = " ";
    }
    
    void readsent()
    {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter sentence !") ;
        str += sc.nextLine() + " ";
    }
    
    int freq_vowel(String w)
    {
        int count= 0 ;
        for(int i=0;i< w.length();i++)
        {
            if(w.charAt(i)=='a'||
            w.charAt(i)=='e'||
            w.charAt(i)=='i'||
            w.charAt(i)=='o'||
            w.charAt(i)=='u'||
            w.charAt(i)=='A'||
            w.charAt(i)=='E'||
            w.charAt(i)=='I'||
            w.charAt(i)=='O'||
            w.charAt(i)=='U'
            )
            {
            count++ ;
            }
        }
        return count ;
    }
    
    void arrange()
    {
        WordWise obj = new WordWise () ;
        String tempString = "" ;
        for(int m=0;m< str.length()-1;m++)
        {
            if(str.charAt(m)==' ')
            {
                int x = m+1 ;
                while(str.charAt(x)!=' ')
                {
                    tempString +=str.charAt(x) ;
                    x++ ;
                    
                }
            System.out.println(tempString) ;
            System.out.println("No of Vowels present :"+obj.freq_vowel(tempString)) ;
            tempString = "" ;
        }
    }
    
    }
    public static void main(String args[] ) 
    {
    WordWise run = new WordWise () ;
    run.readsent() ;
    run.arrange() ;
    }
    }   