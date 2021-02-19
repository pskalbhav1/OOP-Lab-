import java.io.File;
import java.io.IOException;
public class L10A5 {
    public static void main(String args[]) throws IOException
    {
        File directoryPath = new File("D:\\Praseedha");
       String contents[] = directoryPath.list();
        System.out.println("List of files and directories in the specified directory:");
       for(int i=0; i<contents.length; i++) {
         System.out.println(contents[i]);
    }
    }
    
}
