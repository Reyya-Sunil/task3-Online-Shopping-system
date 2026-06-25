package OOPS.INHERITANCE.Hierarchicalinheritance;



public class Rectangle  extends shapeNEw{
double length;
double breadth;
Rectangle(double length, double breadth){
	this.breadth=breadth;
	this.length=length;
}
public void area() {
	System.out.println("Rectangle Area :"+length*breadth);
}

}
