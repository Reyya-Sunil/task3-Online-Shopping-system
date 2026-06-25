package AbstractClass_Abstraction;

public class Circle extends Shape {
	double Radius;
Circle(double Radius ){
	this.Radius =Radius ;
}
 public void calculateArea1() {
	 double res  = (3.14)*(Radius*Radius);
	 System.out.println("Area Circle Radius : "+res);
 }

}
