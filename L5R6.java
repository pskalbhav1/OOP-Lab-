class Book{
String title,edition,author;
Book(String t,String a, String e)
{
title=t;
author=a;
edition=e;
}
void display()
{
System.out.println(title+":"+edition);
}
}
public class L5R6 {
public static void main(String args[])
{
Book b[];
b = new Book[6]; //Creating array of objects
b[0]= new Book("OOPS","Kaith","2000");
b[1]= new Book("C++","Richard","2020");
b[2]= new Book("C","Kaith","2016");
b[3]= new Book("Java","Harry","2009");
b[4]= new Book("OOPS","Harry","2013");
b[5]= new Book("Python","R.v.Seth","1997");
for(int i=0;i<6;i++)
{
if(b[i].author.equals("Harry")) //Checking if author is Harry
{
b[i].display();
}
}
}
}
