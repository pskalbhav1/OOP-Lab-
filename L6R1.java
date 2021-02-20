import java.util.Scanner;
class Account {
    String name;
    long acc;
    String accType;
    
    Account(String nm,long a,String type){
    this.name = nm;
    this.acc = a;
    this.accType = type;
    }
    void diplay(){
        System.out.println("Name :"+this.name+"\nAccount Number :"+this.acc+"\nAccount Type :"+this.accType);
        
    }
}
class Savings extends Account {
    double amount,r=5;int time;
    Savings(String nm,long a,int t){
    super(nm,a,"Savings");
    this.time=t;
}
    
    void deposit(double amt){
        this.amount+=amt;
        updateBalance();
    }
    
    void updateBalance(){
        this.amount = (this.amount*r*time)/100.0;
    }
    
    void withdraw(double amt){
        if(this.amount>0)
        this.amount-=amt;
        else
            System.out.println("Insufficient balance");
    }
    void showBalance(){
        System.out.println("Balance in rupees is "+amount+" only");
    }
    
}
class Current extends Account {
    double amount,pen=100;
    double minBalance = 1000;
    Current(String nm,long a)
    {
        super(nm,a,"Current");
    }
    void deposit(double amt){
        this.amount +=amt; 
    }
    void withdraw(double amt){
        if(this.amount>0)
        this.amount-=amt;
        else
            System.out.println("Insufficient balance");
        if(this.amount<minBalance)
            this.amount-=pen;
    }
    void showBalance(){
        System.out.println("Balance in rupees is "+amount+" only");
    }
}
public class L6R1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String nm,tp;long acn;
        System.out.println("Enter name , account type and account number");
        nm = sc.nextLine();
        tp=sc.next();
        acn=sc.nextLong();
        
        Account ac = new Account(nm,acn,tp);
        if(tp.equals("Savings"))
        {
        	System.out.println("Do you want to deposit or withdraw enter (d/w)");
        	char ch = sc.next().charAt(0);
            System.out.println("Enter the amount ");
            double amt = sc.nextDouble();
            System.out.println("Enter time");
            int t = sc.nextInt();
            Savings ob = new Savings(nm,acn,t);
            if(ch=='d')
            	ob.deposit(amt);
            else
            	ob.withdraw(amt);
            ob.showBalance();
            ob.diplay();
        }
        else if(tp.equals("Current"))
        {
        	System.out.println("Do you want to deposit or withdraw enter (d/w)");
        	char ch = sc.next().charAt(0);
            System.out.println("Enter the amount ");
            double amt = sc.nextDouble();
            Current ob = new Current(nm,acn);
            if(ch=='d')
            	ob.deposit(amt);
            else
            	ob.withdraw(amt);
            ob.showBalance();
            ob.diplay();
        }
    }
}
