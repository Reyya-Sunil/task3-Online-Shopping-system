package OOPS.INHERITANCE.NonPrimitiveTypeCasting;

import java.util.Scanner;

public class Ola {

	
}


 class Cab extends Ola{
	Cab() {
		System.out.println("Cab is booked");
	     
			
		}
	
		
		
	}
	
	
	 
	 

 class Parcle extends Ola{
	 
 }
 class Sedan extends Cab{
	 int  price = 50;
	  Sedan() {
		 System.out.println("Sedan Cab price per kilometer : "+price);
	 }
	  
	 
 }
 class Mini extends Cab{
	 int  price = 25;
	 Mini(){
		 System.out.println("Mini Cab price per Kilometer : "+price);
	 }
	
 }
 class Lux extends Cab{
	int price = 60 ;
	 Lux(){
		System.out.println("Lux Cab price per kilometer : "+price); 
	 }
	
 }
 
