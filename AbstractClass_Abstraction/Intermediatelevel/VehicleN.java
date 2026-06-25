package AbstractClass_Abstraction.Intermediatelevel;

public abstract class VehicleN {
String brand;
VehicleN(String brand){
	this.brand=brand;
}
public abstract void start();
public void display() {
	System.out.println("Brand :"+brand);
}
}
