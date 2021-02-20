import java.util.Scanner;
public class L4R1 {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
int i,j,n,sum=0;
n=in.nextInt();
int p[ ][ ]= new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
p[i][j]=in.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if((i + j) == (n - 1)) // Condition to find secondary diagonal elements
{
sum+=p[i][j];
System.out.println(p[i][j]);
}
}
}
System.out.println("Sum:"+sum);
}
}
