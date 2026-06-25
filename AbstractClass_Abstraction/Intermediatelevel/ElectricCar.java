package AbstractClass_Abstraction.Intermediatelevel;

public class ElectricCar extends VehicleN implements ElectricN {
	ElectricCar(String brand){
		super(brand);
	}
public void start() {
	
	System.out.println("Electric Car has Silently Start....");
}
public void battery() {
	System.out.println("Batteryy charging...");
}

}
