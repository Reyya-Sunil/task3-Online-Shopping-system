package AbstractClass_Abstraction.Intermediatelevel;

public class Bus extends Transport{
	int kilometer = 25;
public void calculateFare(int distance) {
	int res = kilometer*distance;
	System.out.println("Bus Fare :"+res+" Distance :"+distance);
}
}
