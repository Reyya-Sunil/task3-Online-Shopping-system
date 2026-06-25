package OPPS.Project.Restarunt;

import java.util.Scanner;

public class Burger extends FoodItem {
	Scanner sc = new Scanner(System.in);
	Boolean isComboAvailable;
	private  String itemName;
	private  double price;
	private  int quantity ;
	private int n ;

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	String PName1 = "McAloo Tikki Burger : ";
	int PPrice1 = 79;
	String PName2 = "McVeggie Burger ";
	int PPrice2 =179;
	String PName3 = "McChicken Burger ";
	int PPrice3  = 199;

	void displayItem() {
		System.out.println("👉 Select Your Choice: ");
		System.out.println("1. McAloo Tikki Burger");
		System.out.println("2. McVeggie Burger");
		System.out.println("3. McChicken Burger");
		int n = sc.nextInt();
		System.out.println("\u001B[30m=================================\u001B[0m");
		if(n<=3) {
			System.out.println("Enter quantity : ");
			 quantity = sc.nextInt();
			System.out.println("\u001B[30m=================================\u001B[0m");
		}
		switch(n) {
		case 1:{
			setItemName( PName1, PPrice1, quantity);
			break;
		}
		case 2 :{
			setItemName( PName2, PPrice2, quantity);
			break;
		}
		case 3 : {
			setItemName( PName3, PPrice3, quantity);
			break;
		}
		default :{
			System.err.println("Not Available Items");
			
		}
		}
		
		}
	 public  void setItemName(String itemName,double price,int quantity) {
			this.itemName = itemName;
			this.price = price;
			this.quantity = quantity;
			
		  }
	 public String getitemName() {
		  return itemName;
	  }
	  public double getprice() {
		  return price;
	  }
	  public int getquantity() {
		  return quantity;
	  }
	public  double calculateBill() {
		  double total = price*quantity;
			System.out.println("TOTAL: ₹ "+total);
		  return total;
	  }
	public boolean isValid() {
	    return istrue1;
	}

}
		

