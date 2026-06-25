package chatgpt_practise_Question.OnlineShoppingSystem;

public class User {

	public static void main(String[] args) {
	Product p = new Electronics(7800);
  System.out.println("Product discount : "+p.applyDiscount() );
  System.out.println("Product finalprice : "+p.calculatePrice());

	}

}
