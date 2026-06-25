package OPPS.Project.Restarunt;

import java.util.Scanner;

 class RestaruntBill  {
	Scanner sc = new Scanner(System.in);
	FoodItem item;
	 double totalBill;
	 boolean isValid = true;
void showMenu() {
	
	System.out.println("\u001B[30m=================================\u001B[0m");	
	System.out.println("🍕🍕 WELCOME TO PIZZA HUT 🍕🍕");	
	System.out.println("👉 Select Your Choice  :");
	System.out.println("1. Pizaa ");
	System.out.println("2. Burger");
	int input = sc.nextInt();
	System.out.println("\u001B[30m=================================\u001B[0m");	
	
	
	switch(input) {
	case 1 :{
		item = new pizza(); //runtime polymorphism
		item.displayItem();
		
		
		break;
	}
	case 2 :{
		item = new Burger();//runtime polymorphism
		item.displayItem();
		break;
	}
	
	 default: {
		 System.out.println("\u001B[30m=================================\u001B[0m");
         System.out.println("\u001B[31m Invalid option choose! \u001B[0m");
         System.out.println(" Try again... ");
          isValid = false;
          
     }
	}
	
}
pizza p =new pizza();
Burger b = new Burger();



public void generateBill() {
	  if(item == null || !item.isValid()) {
	        System.out.println("❌ Cannot generate bill. Invalid selection.");
	        return;
	    }
	
	 System.out.println("💰 Bill is generating...");
	 totalBill = item.calculateBill();
	 System.out.println("Bill Ready 💵 ");
	}

void printBill1( ) {
	 if(item == null || !item.isValid()) {
	        System.out.println("❌ No bill to print.");
	        return;
	    }
	
	 System.out.println("\n\u001B[30m====== BILL 🧾 ================= \u001B[0m");
    
     
     if(item instanceof pizza) {

    	 pizza p = (pizza)item;
 
    	 System.out.println("Item Name  : "+p.getitemName());
    	 System.out.println("Item Price : "+p.getprice());
    	 System.out.println("Quantity   : "+p.getquantity());
        p.calculateBill() ;
     System.out.println("🙏 THANK YOU VISIT AGAIN ");
     System.out.println("\u001B[30m=================================\u001B[0m");
     }else {
    	 Burger b = (Burger)item;
    
    	 System.out.println("Item Name  : "+b.getitemName());
    	 System.out.println("Item Price : "+b.getprice());
  	 System.out.println("Quantity   : "+b.getquantity());
    	 b.calculateBill();
    	 System.out.println("🙏 THANK YOU VISIT AGAIN ");
    	 System.out.println("\u001B[30m=================================\u001B[0m");
     }}
     
}

	
	



