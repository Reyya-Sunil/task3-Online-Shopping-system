package chatgpt_practise_Question.RideBookingSystem;

public class BikeRide implements Ride{
double priceKm= 2;
int distance;
BikeRide(int distance){
	this.distance= distance;
}

	public double calculateFare() {
		double fareprice = priceKm*distance;
		return fareprice;
	}

}
