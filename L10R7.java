public class L10R7 {
    public static void main(String args[])
    {
        String y="abc";
        try
        {
            int p=Integer.parseInt(y);
            System.out.println(p);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally");
        }
        
    }
    
}
