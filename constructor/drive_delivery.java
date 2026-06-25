package constructor;

public class drive_delivery {
	public static void main(String[] args) {
		delivery_details d1 = new delivery_details("Sunil",1234);
		System.out.println("PARAMETRE CONSTRUCTOR NAME :"+d1.name);
		System.out.println("PARAMETRE CONSTRUCTOR ID :"+d1.id);
		System.out.println("____________________________________________________");
		delivery_details d2 = new delivery_details();
		d2.id =123;
		d2.name="aravind";
		System.out.println("NON PARAMETER CONSTRUCTOR  ID :"+d2.id);
		
		System.out.println("NON PARAMETER CONSTRUCTOR NAME : "+d2.name);
		System.out.println("__________________________________________________________");
		
	}
	

	
}
