import java.util.Scanner;
public class L10R8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        
        int [] arr = new int[n]; // Declaring n size array
        
        
        for(int i = 0; i < n*2 ; i++) // Accesing values larger than n 
        {
            System.out.println("Enter element ");
            int x = sc.nextInt();;
            try {
                ArrayOverFlowException.check(i, n); // Checking for error
                arr[i] = x;
            }catch (ArrayOverFlowException e){ //Catching error
                System.out.println(e.getMessage());
            }
        }
    
    }
}

 class ArrayOverFlowException extends Exception // Exception class to throw error
 {

        public ArrayOverFlowException(String m) {
            super(m);
        }
        
        static void check(int i,int n)throws ArrayOverFlowException // Function to throw an error
        {
            if(i>=n)
                throw new ArrayOverFlowException("Array Overflow"); // throwing the error on given condition 
        }
        
    }

