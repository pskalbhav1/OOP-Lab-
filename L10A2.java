import java.util.Scanner;

public class L10A2 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        try{
            if(p<0)
            {
                throw new NegativeArraySizeException();
            }
        }catch(NegativeArraySizeException e)
        {
            System.out.println(e);
        }
    }
    
}
