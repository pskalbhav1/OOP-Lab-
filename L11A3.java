import java.util.Scanner;
class threax implements Runnable{
   
    public void run(){
        try{
            System.out.println("Name:"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    }

public class L11A3 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Input:");
        String x=in.nextLine();
        threax p=new threax();
        Thread t=new Thread(p);
        t.setName(x);
        t.start();
        
        
        
    }
    
}
