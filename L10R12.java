import java.lang.Math;
import java.util.Scanner;
class NotSquare extends Exception{
    NotSquare()
    {
        System.out.println("Negative Number can't be square");
    }
}
class Mxp{
    Mxp(){
        
    }
     public void tty(double p)
     {
        try{
            if(p<0)
            {
                throw new NotSquare();
            }
            p=Math.sqrt(p);
            System.out.println(-1*p);
        }
            catch(NotSquare e)
                    {
                    System.out.println(e);
                    }
            
        }
}
public class L10R12 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        double p=in.nextDouble();
        Mxp mp=new Mxp();
        mp.tty(p);     
        
        
       
    }
    
}
