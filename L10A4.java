import java.util.Scanner;
class MarkOutofBoundsException extends Exception{
    MarkOutofBoundsException()
    {
        System.out.println("Marks out of range");
    }
}
class Student{
   public void s(int marks){
    try{
    if(marks>100)
    {
        throw new MarkOutofBoundsException();
    }}catch(MarkOutofBoundsException e)
            {
            System.out.println(e);
            }
    
}
}
public class L10A4 {
    public static void main(String args[])
    {
        Student S1=new Student();
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        S1.s(m);
    }
    
}
