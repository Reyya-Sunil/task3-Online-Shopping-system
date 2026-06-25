package chatgpt_practise_Question.RideFareCalculator;

import java.util.Scanner;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class user {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ride distance :");
	double distance = sc.nextDouble();
	System.out.println("Enter type of ride (Bike)(Luxury)(Mini)");
	String type= sc.nextLine();
	System.out.println("Enter day/Night");
	String NightCharge= sc.nextLine();
	Ride ride;
	double fare = Ride.calculateFare();
	if(NightCharge.equalsIgnoreCase("night")) {
		
	}
    if(type.equalsIgnoreCase("bike")) {
        ride = new BikeRide(distance);
    } else if(type.equalsIgnoreCase("mini")) {
        ride = new MiniRide(distance);
    } else {
        ride = new LuxuryRide(distance);
    }
	
}
}
