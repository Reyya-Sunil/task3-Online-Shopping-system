package chatgpt_practise_Question.RideFareCalculator;

public class LuxuryRide  extends  Ride{
double perKm = 15;
LuxuryRide(double distance ){
	super(distance);
}

	@Override
	public  double calculateFare() {
		
		
	double res = perKm*distance;
		return res;
	}

}
