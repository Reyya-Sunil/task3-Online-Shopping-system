package OOPS.Interface;

public class NetBankingPayment implements PaymentGateway {
	double amount = 250000;
public void processPayment(double amount) {
	System.out.println(" NetBankingPayment is prosseing...");
}
public void validateUser() {
	System.out.println("NetBankingPayment is validate by Tarun");
}
}
