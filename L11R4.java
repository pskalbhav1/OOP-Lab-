class Mythreadxp implements Runnable{
    public void run(){
    System.out.println("Thread:"+Thread.currentThread());
    try{
        Thread.sleep(500);
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
        
}
}
public class L11R4 {
    public static void main(String args[])
    {
        Mythreadxp m=new Mythreadxp();
        Thread t=new Thread(m);
        t.start();
        t.setPriority(2);
        int p = t.getPriority();
        System.out.println("thread priority : " + p);  
    }
    
}
