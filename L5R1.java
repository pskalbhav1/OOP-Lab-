class Box {
double width;
double height;
double depth;
// constructor used when all dimensions specified
Box(double w, double h, double d)
{
width = w;
height = h;
depth = d;
}
double volume()
{
return width * height * depth; //Finding volume
}
}
public class L5R1 {
public static void main(String args[]) {
// create boxes using the various constructors
Box mybox1 = new Box(10, 20, 15); //Creating object
double vol; // get volume of first box
vol = mybox1.volume();
System.out.println("Volume of mybox1 is " + vol);
}
}
