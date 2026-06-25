package chatgpt_practise_Question.OnlineShoppingSystem;

public abstract class Product implements Discount {
	public double price;
	Product(double price){
		this.price = price;
	}
public abstract double calculatePrice();
}
