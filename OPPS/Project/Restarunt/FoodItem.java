package OPPS.Project.Restarunt;
  abstract class FoodItem  {
private  static String itemName;
private static double price;
private  static int quantity;


public int getquantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	FoodItem.quantity = quantity;
}

public static String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	FoodItem.itemName = itemName;
	
}
public void setPrice(double price) {
	
	FoodItem.price = price;

}

	

public static double getPrice() {
	return price;
}




 abstract void displayItem();
 abstract double calculateBill();
 abstract boolean isValid();

}



