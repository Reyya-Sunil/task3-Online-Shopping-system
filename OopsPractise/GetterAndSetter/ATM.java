package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class ATM {
private int pin = 2424;
private int balance = 40000;
public void validatePin(int inputPin) {
	Scanner sc = new Scanner(System.in);
	if(pin == inputPin) {
		System.out.println("Succesful login SBI BANK");
	
		System.out.println("HI SUNIL ");
		System.out.println("Select option ?");
		System.out.println(" 1 : Withdraw");
		System.out.println(" 2 : Deposit");
		System.out.println(" 3 : CheckBalance");
		int in = sc.nextInt();
		switch(in) {
		case 1 : {
			System.out.println("Enter a withdraw Amount ");
			int with = sc.nextInt();
			withdraw(with);
			break;
			
		}
		case 3:{
			System.out.println("Current Balance :"+balance);
			break;
		}
		case 2 :{
			System.out.println("Enter Deposit Ammount :");
			int dep = sc.nextInt();
			deposit( dep);
			break;
		}
		default :{
			System.err.println("Invalid option !");
		}
		
		}
		
		
	}else {
		System.err.println("Pin is Incorrect !");
	}
}
public void withdraw(int with) {
	if(balance >= with) {
	balance -=with;
	System.out.println("After withdraw Balance :"+balance);
	}else {
		System.err.println("Insufficent Balance !");
	}

}
public void deposit(int dep) {
	if(dep >=0) {
	balance +=dep;
	System.out.println("After deposit Balance :"+balance);
    }else {
	System.err.println("Invalid deposit !");
}

}}
