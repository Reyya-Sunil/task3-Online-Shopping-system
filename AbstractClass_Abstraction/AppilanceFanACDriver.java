package AbstractClass_Abstraction;

public class AppilanceFanACDriver {
public static void main(String[] args) {
	Appliance A = new Fan();
	A.turnOn();
	Appliance B  = new Ac();
	B.turnOn();
}
}
