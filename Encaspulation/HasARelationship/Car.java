package Encaspulation.HasARelationship;

public class Car {
private String brand;
private String fueltype;
void setbrand(String brand) {
	this.brand=brand;
}
private Engine e =new Engine(345);
public Engine getEngine() {
	return e;
}
public String getBrand() {
	return brand;
}
public  void  setBrand(String brand) {
	this.brand = brand;
}
public String getFueltype() {
	return fueltype;
}
public void setFueltype(String fueltype) {
	this.fueltype = fueltype;
}

}
