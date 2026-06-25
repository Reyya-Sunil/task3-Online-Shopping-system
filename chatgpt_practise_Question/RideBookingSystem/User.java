package chatgpt_practise_Question.RideBookingSystem;

public class User {

public static void main(String[] args) {
	Ride r = new BikeRide(40);
	Ride  p = new AutoRide(40);
	Ride n = new CabRide(40);
	System.out.println("Bike Ride fare : "+r.calculateFare()  );
	System.out.println("Auto Ride fare : "+p.calculateFare());
	System.out.println("Cab Ride fare : "+n.calculateFare());
}
}
