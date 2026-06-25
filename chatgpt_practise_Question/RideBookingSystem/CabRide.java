package chatgpt_practise_Question.RideBookingSystem;

public class CabRide  implements Ride{
double perKm = 5;
int  distance;
CabRide(int distance){
	this.distance=distance;
}
	@Override
	public double calculateFare() {
		double fareprice = perKm*distance;
		return fareprice;
	}

}
