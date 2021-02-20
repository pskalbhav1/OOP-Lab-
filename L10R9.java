import java.util.Scanner;
public class L10R9 {
    public static void main(String args[])
    {
        int i;
        Scanner in = new Scanner(System.in);
       
       
        String name, RollNo;
        String m1,m2,m3;
        name=in.nextLine();
        RollNo=in.nextLine();
         m1=in.nextLine();
         m2=in.nextLine();
          m3=in.nextLine();
         int i1=0,i2=0,i3=0;
          try {
            i1 = Integer.parseInt(m1);
        } catch (NumberFormatException e) {
            System.err.println("Unable to format. " + e);
        }
          try {
            i2 = Integer.parseInt(m2);
        } catch (NumberFormatException e) {
            System.err.println("Unable to format. " + e);
        }
        try {
            i3 = Integer.parseInt(m3);
        } catch (NumberFormatException e) {
            System.err.println("Unable to format. " + e);
        }
        double per=(i1+i2+i3)/3;
        
        System.out.println(per);
        char G;
        if(per>90)
        {
            G='A';
        }
        else if(per>80)
        {
            G='B';
        }
        else if(per>70)
        {
            G='c';
        }
        else
        {
            G='F';
        }
        System.out.println(G);
         
    }
   
}
