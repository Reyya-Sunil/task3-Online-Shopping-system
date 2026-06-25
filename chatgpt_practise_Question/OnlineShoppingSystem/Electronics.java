package chatgpt_practise_Question.OnlineShoppingSystem;

public class Electronics extends Product {
  Electronics(double price){
	  super(price);
  }

	public double applyDiscount() {
return  (price*0.20);
		
	}

	
	public double calculatePrice() {
	double res = price-applyDiscount();
	
	

	return res;
	}

}
