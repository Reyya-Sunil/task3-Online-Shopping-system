package chatgpt_practise_Question.OnlineOrderPricingSystem;

public class TakeAwayOrder extends Order{
	
public void calculateTotal(double price) {
	double res = price*0.2;
	System.out.println("TakeAwayorder order tax :"+res);
}
}
