package chatgpt_practise_Question.RideFareCalculator;

public class MiniRide extends Ride {
double perKm = 8;
MiniRide(double distance){
	super(distance);
}
	@Override
	public double calculateFare() {
		
		double res = perKm *distance;
		return res;
	}

}
