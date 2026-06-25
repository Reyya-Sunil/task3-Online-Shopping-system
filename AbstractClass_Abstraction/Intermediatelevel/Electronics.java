package AbstractClass_Abstraction.Intermediatelevel;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class Electronics extends Product{
	
Electronics(double price){
	super(price);
}
double calculateDiscount() {
	return price*0.10;
}
}
class Clothings extends Product{

	Clothings(double price){
		super(price);
	}
	double calculateDiscount() {
		return price*0.30;
	}
}
class Groceries extends Product{
	
	
	Groceries(double price) {
		super(price);
		
	}

	double calculateDiscount() {
		return price*0.80;
	}
	
}

