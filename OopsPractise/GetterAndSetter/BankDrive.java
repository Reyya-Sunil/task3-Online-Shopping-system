package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class BankDrive {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Deposit ammount :");
	int deposit = sc.nextInt();
	System.out.println("Enter Withdraw ammount :");
	int withdraw = sc.nextInt() ;
	Bank b1 = new Bank();
	b1.setbalance(40000);
	b1.deposit(deposit);
	b1.withdraw(withdraw);
}
}
