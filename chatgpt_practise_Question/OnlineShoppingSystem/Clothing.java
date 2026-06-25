package chatgpt_practise_Question.OnlineShoppingSystem;

public class Clothing extends Product {

	Clothing(double price) {
		super(price);
		
	}

	@Override
	public double applyDiscount() {
	 
		return price*0.25;
	}

	@Override
	public double calculatePrice() {
	double discount = applyDiscount();
	
		return price-discount;
	}

}
