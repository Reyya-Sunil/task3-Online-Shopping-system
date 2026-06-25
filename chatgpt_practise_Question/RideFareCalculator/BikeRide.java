package chatgpt_practise_Question.RideFareCalculator;

public class BikeRide extends Ride {
	double perKm = 5;
	BikeRide(double distance ){
		super(distance);
	}
	@Override
	public double calculateFare() {
		
		double res = distance*perKm;
		
		return res;
	}

}
