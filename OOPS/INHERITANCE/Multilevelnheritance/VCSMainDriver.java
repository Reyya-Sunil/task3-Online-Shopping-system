package OOPS.INHERITANCE.Multilevelnheritance;

public class VCSMainDriver {
public static void main(String[] args) {
	Vehicle v = new Vehicle();
	v.start();
	Car  c= new Car();
	c.start();
	c.drive();
	SportsCar s = new SportsCar();
	s.start();
	s.drive();
	s.speed();
	
}
}
