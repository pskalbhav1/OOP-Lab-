import java.util.Scanner;
//Creating a main Class Bank
class Bank {
    double roi;
    Bank(){}
    double rateOfInterest()
    {
        return roi;
    }
}
// Sub-class SBI with different roi
class SBI extends Bank{
    double roi;
    SBI(double r){
        roi = r;
    }
    double rateOfInterest()
    {
        return this.roi;
    }
}
// Sub-class ICICI with different roi
class ICICI extends Bank {
    double roi;
    ICICI(double r){
        roi = r;
    }
    double rateOfInterest()
    {
        return this.roi;
    }
}
// Sub-class Axis with different roi
class Axis extends Bank {
    double roi;
    Axis(double r){
        roi = r;
    }
    double rateOfInterest()
    {
        return this.roi;
    }
}

public class L6R3{
    public static void main(String [] args){
        Bank b = new Bank(); // to refer to different objects
        SBI sbi = new SBI(8);
        ICICI ic = new ICICI(7);
        Axis ax = new Axis(9);
        
        b=sbi; //b refers to an SBI object
        System.out.println("Rate of Interest in SBI is "+b.rateOfInterest());
        b=ic; //b refers to an ICICI object
        System.out.println("Rate of Interest in ICICI is "+b.rateOfInterest());
        b=ax; // b refers to an Axis object
        System.out.println("Rate of Interest in Axis is "+b.rateOfInterest());
    }
}
