import java.util.Scanner;
public class L3R1 {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int s;
int sum=0,rem=0;
s = in.nextInt();
int p=s;
while(s!=0)
{
rem=s%10;
sum=sum+(rem*rem*rem);
s=s/10;
}
if(sum==p)
{
System.out.println("Input number is Armstrong Number");
//Sum of cube of digits equals the number
}
else
{
System.out.println("Not an Armstrong Number");
}
}
}
