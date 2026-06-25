package OOPS.ENCAPSULATION.Has_Singleton;

public class Eager2 {
private static   Eager2 v = new Eager2();  // obj is created when class is load
Eager2(){
	System.out.println("Hello i am eager when class is load i am created obj");
}
public static Eager2 getEager2() {
	return v;
}
 static Eager2 display() {
	System.out.println("I am display method");
	return v;
}
}
