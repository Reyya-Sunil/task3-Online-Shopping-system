package AbstractClass_Abstraction;

public class Rectangle extends Shape {
	double length;
	double width;
Rectangle(double length , double width){
	this.length= length;
	this.width= width;
}
public void calculateArea1() {
	double res = (length*width);
	System.out.println("Area of Rectangle  : "+res);
}
}
