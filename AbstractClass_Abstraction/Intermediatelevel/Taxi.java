package AbstractClass_Abstraction.Intermediatelevel;

public class Taxi extends Transport {
int kilometer ;
public void calculateFare(int distance) {
	int res = kilometer*distance;
	System.out.println("Taxi fare :"+res+" Distance : "+distance);
}
}
