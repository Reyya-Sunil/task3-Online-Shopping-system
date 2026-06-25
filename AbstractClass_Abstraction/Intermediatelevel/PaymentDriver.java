package AbstractClass_Abstraction.Intermediatelevel;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class PaymentDriver {
public static void main(String[] args) {
	Payment p = new CashPayment();
	p.pay(40000);
}
}
