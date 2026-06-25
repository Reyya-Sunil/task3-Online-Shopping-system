package OOPS.INHERITANCE.Hierarchicalinheritance;



public class Circle extends shapeNEw {
	double radius;
Circle(double radius){
	this.radius=radius;
	
}
public void area () {
	System.out.println("Circle area :"+(3.14)*(radius*radius));
}
}
