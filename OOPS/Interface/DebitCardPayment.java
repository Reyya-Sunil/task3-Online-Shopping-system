package OOPS.Interface;

public class DebitCardPayment implements PaymentGateway {
	double amount = 30000;
public void processPayment(double amount) {
	System.out.println("DebitCardPayment is prosseing.....");
}
public void validateUser() {
	System.out.println("DebitCardPayment is validate by Aravind");
}
}
