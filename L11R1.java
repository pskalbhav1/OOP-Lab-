import java.util.Scanner;
class Mythread1 implements Runnable{
    public void run() {
    System.out.println("Runnable Interface with threads");
   }
}
class Mythread2 extends Thread{
    public void run(){
        System.out.println("Extending thread class");
    }
}
public class L11R1 {
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Using Runnable Interface:");
        System.out.println("2. Using Inherited thread class:");
        int ch=in.nextInt();
        if(ch==1)
        {
            Mythread1 mt= new Mythread1();
            Thread t= new Thread(mt);
            t.start();
            
        }
        else if(ch==2)
        {
           Mythread2 my= new Mythread2();
           Thread t=new Thread(my);
           t.start();
        }
        else
        {
            System.out.println("Wrong choice");
        }
    }
    
}
