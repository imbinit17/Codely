/*
       Define a class student with the following members : 
       
       Data Members : 
           String nm --> to store name of student
           int m1,m2.m3 -->to store computer marks of 3 terms
           char grad --> to store the grade obtained by student
  
       Member Methods : 
           void getData() --> to accept name and marks of the three terms of the student from the user
           double calAvg() --> to calculate Yearly avg and return it
           void calGrade() --> to calculate grade on basis of yearly performance as :
                           Avg Marks                 Grade
                           <40                         D
                           >=40 & <60                  C
                           >=60 & <80                  B
                           >=80                        A
           void show() --> to display name ,marks of the three terms ,avg marks and the grade obtained by student
  
       Also write a main method to implement above class
 */
import java.util.* ;
public class student 
{
    private int m1 ,m2 ,m3 ;
    private String nm ;
    private char grad ;

    void getData()
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the name of the student !") ;
        nm = sc.nextLine() ;

        System.out.println("Enter the marks of the student in Computer in three terms !") ;
        m1 = sc.nextInt() ;
        m2 = sc.nextInt() ;
        m3 = sc.nextInt() ;

        if(m1>100 ||m2>100|| m3 >100)
        {
            System.out.println("Marks obtained is out of 100 ! Please try again ") ;
            System.exit(0);
        }
    }

    double calAvg()
    {
        return (double) (m1+m2+m3)/3 ;
    }

    void calGrade()
    { 
        double avg = this.calAvg() ;
        if(avg<40)
        grad ='D' ;

        else if(avg>=40 && avg<60)
        grad = 'C' ;

        else if(avg<=60 && avg>60)
        grad = 'B' ;

        else if(avg>80)
        grad = 'A' ;
    }

    void show()
    {
        System.out.println("NAME :\t"+nm) ;
        System.out.println("MARKS SCORED :") ;
        System.out.println("FIRST TERM :\t"+m1) ;
        System.out.println("SECOND TERM :\t"+m2) ;
        System.out.println("THIRD TERM :\t"+m3) ;
        System.out.println("AVERAGE MARKS :\t"+this.calAvg()) ;
        System.out.println("GRADE OBTAINED:\t"+grad) ;
    }

    public static void main(String[] args)
    {
        student student1 = new student() ;
        student1.getData();
        student1.calGrade();
        student1.show();
    }
}