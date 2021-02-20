import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class L10R2 {
    public static void main(String args[])throws IOException
    {
        
        int position=0;
       try{
           RandomAccessFile rf=new RandomAccessFile("filename.txt","rw");
           rf.seek(position);
           try{
               byte[] by="Hello".getBytes("UTF-8");

               rf.write(by);
             RandomAccessFile f=new RandomAccessFile("filename.txt","r");
             while(true)
             {
                 int data=f.read();
             
            System.out.println(data);
             }
          
           }catch(FileNotFoundException p)
                    {
                      System.out.println(p);
                    }
                    
               rf.close();
           }catch(IOException ep)
           {
              System.out.println(ep);
           }
           
       }
        
    }    

