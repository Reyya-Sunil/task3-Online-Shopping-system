package AbstractClass_Abstraction.Intermediatelevel;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class ProductDRiver {
public static void main(String[] args) {
	
			Product p = new Electronics(456);
			Product b = new Clothings(420);
			Product s = new Groceries(250);
			System.out.println("Eclectronic Discount : "+p.calculateDiscount());
			System.out.println("Clothings Discount : "+b.calculateDiscount());
			System.out.println("Groceries Discount : "+s.calculateDiscount());
	
}
}
