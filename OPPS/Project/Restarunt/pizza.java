package OPPS.Project.Restarunt;

import java.util.Scanner;

public  class pizza extends FoodItem  {

Scanner sc = new Scanner(System.in);
Boolean isExtrachees;
private    String itemName;
private   double price;
private    int quantity ;
private int n;
boolean istrue1 = true;

public boolean isValid() {
    return istrue1;
}

public int getN() {
	return n;
}


public void setN(int n) {
	this.n = n;
}
String PName1 = "Margherita";
int PPrice1 =199;
String PName2 = "Peppy Paneer";
int PPrice2 =379;
String PName3 = "Chicken Dominator";
int PPrice3  = 599;

 public void displayItem() {
 
	System.out.println("👉 Select Your Choice: ");
	System.out.println("1. Margherita");
	System.out.println("2. Peppy Paneer");
	System.out.println("3. Chicken Dominator");
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
		
	 break;
	 
	    
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

 

 


  

}
