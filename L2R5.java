import java.util.Scanner;
public class L2R5 {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
float s, p;
char ch;
char op;
do{
System.out.println("Enter first number, operator, second number:");
s=in.nextFloat();
op= in.next().charAt(0);
p=in.nextFloat();
System.out.println("Answer:");
switch(op)
{
case '+':
{
System.out.println(s+p);
break;
}
case '-':
{
System.out.println(s-p);
break;
}
case '*':
{
System.out.println(s*p);
break;
}
case '/':
{
System.out.println(s/p);
break;
}
default:
{
System.out.println("Wrong input");
}
}
System.out.println("Do another (y/n)?"); // Repeat if yes
ch= in.next().charAt(0);
}while(ch=='y');
}
}
