import java.util.Scanner;
public class L3R5 {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int s;
int a[]={1,2,3,1,2,1,5,6,7};
s = in.nextInt();
System.out.println("The value is found at locations:");
if(a[0]==s)
{
System.out.println("a[0]");
}
for(int i:a)
{
if(a[i]==s)
{
System.out.println("a["+i+"]"); //Finding location of inputted number in given array
}
}
}
}
