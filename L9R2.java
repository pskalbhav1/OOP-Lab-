import java.util.Scanner;
public class L9R2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s; //Variable to accept string
        System.out.println("Enter string");
        s = sc.next();
        
        s=s.toLowerCase();String s2 = "";
        int [] a = new int[26]; // Array to store duplicate characters
        for(int i = 0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            a[ch-97]++; 
            if(a[ch-97]>1)
                s2+=ch;  // Storing the duplicate characters
        }
        System.out.println("New String is:");
        int l = s.length()/s2.length();
        for(int i = 0;i<l;i++)
            System.out.print(s2); // Replacing all the letters
        
        l = s.length()%s2.length();
        for(int i =0 ;i<l;i++)
        System.out.print(s2.charAt(i));
        System.out.println();
    }
}
