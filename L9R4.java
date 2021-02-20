import java.util.Scanner;
public class L9R4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
      
        // Menu to execute different operations
        System.out.println("Enter 1 to Compare two strings");
        System.out.println("Enter 2 to Change Case of a string");
        System.out.println("Enter 3 to Check for substring");
        int ch = sc.nextInt(); // String the choice 
        switch(ch){
            case 1: 
                System.out.println("Enter two strings ");
        s1 = sc.next();
        s2 = sc.next();
                compare(s1,s2); // Function to compare
                break;
            case 2:
                System.out.println("Enter string ");
        s1 = sc.next();
        changeCase(s1); // Function to change case
        break;
            case 3:
                 System.out.println("Enter two strings ");
        s1 = sc.next();
        s2 = sc.next();
        checkSubstring(s1,s2); // Function to check Substring
                break;
            default :
                System.out.println("Wrong choice");
        }
    }

    private static void compare(String s1, String s2) {
        if(s1.compareTo(s2)>0) // Comparing two strings
            System.out.println("String 1 is greater than String 2");
        else
            System.out.println("String 2 is greater than String 1");
    }

    private static void changeCase(String s1) {
        String s="";
        for(int i = 0; i<s1.length();i++ )
        {
            char ch = s1.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ch+=32; // Changing the case upper to lower
                s+=ch;
            }
            else
            {
                ch-=32;
                s+=ch;
            }
        }
        System.out.println("New String 1 is = "+s); // Displaying the result
    }

    private static void checkSubstring(String s1, String s2) {
        if(s1.length()<s2.length()) // Finding the longer string
        {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int l = s1.length();
        int m = s2.length();
        int j = 0;
        for(int i=0;i<l;i++) // Loop to simultaneously check the two strings
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                j++;
            }
            else
                j = 0;
            
            if(j == m)
                break;
        }
        if(j == m) // Printing the result
        {
            System.out.println("String "+s2+" is substring of "+s1 );
            System.out.println("New String "+s1.replace(s2, "Hello"));
        }
        else
            System.out.println("No substring");
    }
}
