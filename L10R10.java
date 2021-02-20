import java.util.Scanner;
public class L10R10 {
    public static void main(String[] args) 
    {
        // Trying to force an error
        try {
            System.out.println("Exception created");
            throw new MyException("User-defined exception");
        } catch (Exception e) // Catch block to handle the exception
        {
            System.out.println("Exception Caught");
            System.out.println(e.getMessage());
        }
    }
}
class MyException extends Exception // User - defined Exception class
{

    public MyException(String message) {
        super(message); //Calling the super class
    }
    
}
