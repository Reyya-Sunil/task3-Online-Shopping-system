package AbstractClass_Abstraction.Intermediatelevel;

public class TransportDriver {
public static void main(String[] args) {
	Transport t = new Bus();
	t.calculateFare(70);
	Transport p = new Train();
	p.calculateFare(500);
}
}
