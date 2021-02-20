import java.util.Scanner;
public class L4R4
{
public static void main(String args[])
{
int m, n, p, q, c, d, k;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows and columns of first matrix");
m = in.nextInt();
n = in.nextInt();
int first[][] = new int[m][n];
System.out.println("Enter elements of first matrix");
for (c = 0; c < m; c++)
for (d = 0; d < n; d++)
first[c][d] = in.nextInt();
System.out.println("Enter the number of rows and columns of second matrix");
p = in.nextInt();
q = in.nextInt();
int second[][] = new int[p][q];
if (n != p) //Necessary condition for matrix multiplication
System.out.println("The matrices can't be multiplied with each other.");
else
{
int multiply[][] = new int[m][q];
System.out.println("Enter elements of second matrix");
for (c = 0; c < p; c++)
for (d = 0; d < q; d++)
second[c][d] = in.nextInt();
System.out.println("MUL");
for(int i=0;i<m;i++){
for(int j=0;j<q;j++){
multiply[i][j]=0;
for( k=0;k<n;k++)
{
multiply[i][j]+=first[i][k]*second[k][j]; // Multiplying as needed
}//end of k loop
System.out.print(multiply[i][j]+" "); //printing matrix element
}//end of j loop
System.out.println();//new line
}
}
int i,j;
if(m==p && n==q) //Necessary condition for addition
{
System.out.println("ADD");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.println(first[i][j]+second[i][j]+" ");
}
}
}
}
}
