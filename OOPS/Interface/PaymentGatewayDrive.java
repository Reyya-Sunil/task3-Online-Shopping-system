package OOPS.Interface;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class PaymentGatewayDrive {
	public static void main(String[] args) {
		PaymentGateway p = new CreditCardPayment();
		p.processPayment(4000);
		p.validateUser();
	}
}
