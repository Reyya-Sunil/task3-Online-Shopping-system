package chatgpt_practise_Question.OnlineOrderPricingSystem;

public class OnlineOrder extends Order {
public void calculateTotal(double price) {
	double res = price*0.10+50;
	System.out.println("OnlieOrder tax :"+res);
}
}
