package Object;

public class Rectangle {
float length;
float weidth;
public void area(float length, float weidth) {
//	this.length= length;
//	this.weidth = weidth;
	float res = length*weidth;
	System.out.println("ANS :"+res);
}
public static void main(String[] args) {
	Rectangle R = new Rectangle();
	R.area(45, 67);
}
}
