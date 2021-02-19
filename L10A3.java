import java.util.Scanner;
class EvenNumberException extends Exception{
    EvenNumberException(){
        System.out.println("Even Number found");
}
}
public class L10A3 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        try{
            if(p%2==0)
            {
                throw new EvenNumberException();
                
            }
        }catch(EvenNumberException e)
        {
            System.out.println("E:"+e);
        }
    }
       
}
