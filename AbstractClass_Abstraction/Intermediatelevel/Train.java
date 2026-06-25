package AbstractClass_Abstraction.Intermediatelevel;

public class Train extends Transport {
int kilometer = 15;
public void calculateFare(int distance) {
	int res = kilometer*distance;
	System.out.println("Train Fare : "+res+" Distance : "+kilometer);
}

}
