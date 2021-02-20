public class L7R2
{
    //Declaring static variable
    // Static implies that it belongs to this class and is not an object
    static int count=0;
    L7R2()
    {
        //Increment count whenever new objet is declared
        count++;
    }

    public static void main(String args[]) 
    {
        L7R2 obj1 = new L7R2();
        L7R2 obj2 = new L7R2();
        System.out.println("Number of objects created:"+count);
    }
}
