package chatgpt_practise_Question.RideBookingSystem;

public  class AutoRide implements Ride {
	double perKm= 3;
	int distance;
AutoRide(int distance){
	this.distance= distance;
}
	public double calculateFare() {
	 double fareprice= perKm*distance;
		return fareprice ;
	}

}
