package OPPS.Project.Restarunt;

public class test {
public static void main(String[] args) {
	 RestaruntBill r = new  RestaruntBill();
	 r.showMenu();
	
	
	 if(r.isValid  ) {
	   
	 r.generateBill();
	 r.printBill1();}
else {
	System.out.println("❌ Cannot generate bill. Please select valid item."); 
	 }
}}

