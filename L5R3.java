class Time{
int hrs,mins,secs;
Time()
{
this.hrs=0;
this.mins=0;
this.secs=0;
}
Time(int hr,int min,int sec)
{
this.hrs=hr;
this.mins=min;
this.secs=sec;
}
void display()
{
System.out.println(hrs+":"+mins+":"+secs);
}
void add(Time t1,Time t2)
{
this.secs=(t1.secs+t2.secs)%60;
this.mins=(t1.mins+t2.mins)%60+(t1.secs+t2.secs)/60;
this.hrs=(t1.mins+t2.mins)/60+(t1.hrs+t2.hrs)%60;
// Calculating the sum of two given times digit by digit
}
}
public class L5R3{
public static void main(String args[])
{
Time t1 = new Time(7, 30, 57);
Time t2 = new Time(5, 00, 30);
Time t3 = new Time();
t1.display();
t3.add(t1, t2);
}
}
