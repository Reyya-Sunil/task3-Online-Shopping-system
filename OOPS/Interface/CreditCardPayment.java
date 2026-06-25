package OOPS.Interface;

public class CreditCardPayment implements PaymentGateway {
	double amount = 40000;
public void processPayment(double amount ) {
	System.out.println("CreditCardPayment is prosseing....."+amount);
}
public void validateUser() {
	System.out.println("CreditCardPayment is validate by Sunil");
}
}
