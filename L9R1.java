import java.util.Scanner;
public class L9R1 { 
  
    // Function to count number of vowels, characters,  
    // words and lines in a string. 
    static void countCharacterType(String str) 
    { 
        // Declare the variables
        int vowels = 0, words=0, lines=0, character=0,letters=0; 
      
        // str.length() function to count number of 
        // character in given string. 
        character=str.length();
        for (int i = 0; i < str.length(); i++) { 
            
            //Finding character at position i of the string
            char ch = str.charAt(i); 
            
            //Checking if string is a character
            if ( (ch >= 'a' && ch <= 'z') ||  
                (ch >= 'A' && ch <= 'Z') ) { 
      
                //Check for letters
                letters++;
                
                //check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || 
                    ch == 'o' || ch == 'u') 
                    vowels++; 
            
            }
            
            //Checking for words
            else if(ch==' ')
            {
                words++;
            }
            
            // Checking for Lines
            else if(ch=='.' || ch=='?' || ch=='!')
            {
                lines++;
            }
            
        } 
        //To count the last word we encounter in string
        words+=1;  
        
        System.out.println("Vowels: " + vowels); 
        System.out.println("Letters: " + letters); 
        System.out.println("Characters: " + character); 
        System.out.println("Words: " + words); 
        System.out.println("Lines: " + lines); 
    } 
      
    // Driver function. 
    public static void main (String args[]) 
    { 
        Scanner in = new Scanner(System.in);
        String str;
        str=in.nextLine();
          
        countCharacterType(str); 
    } 
} 
  
