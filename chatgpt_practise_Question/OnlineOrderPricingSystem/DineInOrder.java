package chatgpt_practise_Question.OnlineOrderPricingSystem;

public class DineInOrder extends Order{
double tax =0.5;
public void calculateTotal(double price) {
	double res = price*tax;
	System.out.println("total amount :"+res);
}

}
