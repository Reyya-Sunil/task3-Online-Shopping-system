package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class Product {
private String productName="Sunil";
private int price;
private  int quantity= 200;
public void setproductName() {
	this.productName=productName;
}
public String getproductName() {
	return productName;
}
public void setprice(int price) {
	Scanner sc = new Scanner(System.in);
	if(price >0) {
		this.price=price;
		System.out.println("Enter quantity to sell it :");
		int quan = sc.nextInt();
		sellproduct( quan ); 
		System.out.println("Price of product :"+price);
	}else {
		System.err.println("Ammount is Invalid !");
	}
	
}
public int getprice() {
	return price;
}
public void sellproduct(int quan ) {
	if(quantity >=quan) {
	quantity -= quan;
	System.out.println("After SellingProduct Quantity :"+quantity);
	
}else {
	System.err.println("Insufficent Quantity !");
}

}
}