import java.util.Scanner;
class Student_Detail
{
    String name;
    String id;
    static String college_name="MIT";
    Student_Detail(String name,String id)
    {
        this.name=name;
        this.id=id;
    }
    void display_details()
    {
        System.out.println("Student's name:"+this.name);
        System.out.println("Student's id:"+this.id);
        System.out.println("Student's college name:"+Student_Detail.college_name);
       
    }
}
public class L7R1 {
    public static void main(String args[])
    {
        String name,id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student's name:");
        name=sc.nextLine();
        System.out.println("Enter student's id:");
        id=sc.nextLine();
        Student_Detail s1=new Student_Detail(name,id);
        s1.display_details();
    }
}
