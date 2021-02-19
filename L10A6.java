import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class L10A6 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        File f=new File("filename.txt");
        try{
            if(f.createNewFile())
        {
            System.out.println("File Created");
        }
        }catch(IOException e){
                e.printStackTrace();
        }
        
        String[] Name=new String[50];
        String[] Emp_No= new String[50];
        Double[] Salary=new Double[50];
        String[] Address=new String[50];
        
        for(int i=0;i<3;i++)
        {
            System.out.println("Details:");
            Name[i]=in.next();
            Emp_No[i]=in.next();
            Salary[i]=in.nextDouble();
            
            Address[i]=in.next();          
        }
        try{
        FileWriter w=new FileWriter("filename.txt");
        for(int i=0;i<3;i++)
        {
            w.write("Name:"+Name[i]+", Emp_no:"+Emp_No[i]+", Salary:"+ Salary[i]+", Address:"+Address[i]);
        }
        w.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        int j;
        String temp;
        String e;
        String a;
        Double s;
        try{
             FileWriter w=new FileWriter("output.txt");
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3-i-1;j++)
            {
                if(Name[j].compareTo(Name[j+1])>0)
                {
                    temp=Name[i];
                    Name[i]=Name[j];
                    Name[j]=temp;
                    e=Emp_No[i];
                    Emp_No[i]=Emp_No[j];
                    Emp_No[j]=e;
                    s=Salary[i];
                    Salary[i]=Salary[j];
                    Salary[j]=s;
                    a=Address[i];
                    Address[i]=Address[j];
                    Address[j]=a;
                    
                    
                } 
            }
        }
        for(int i=0;i<3;i++)
        {
            w.write("Name:"+Name[i]+", Emp_no:"+Emp_No[i]+", Salary:"+ Salary[i]+", Address:"+Address[i]);
        }
        w.close();
        }
        catch(IOException ep)
        {
            ep.printStackTrace();
        }
        try{
            FileReader r=new FileReader("output.txt");
            Scanner m=new Scanner(r);
            while(m.hasNextLine()){
                String data=m.nextLine();
                System.out.println(data);
            }
            m.close();
        }catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
      
    }
}
        

