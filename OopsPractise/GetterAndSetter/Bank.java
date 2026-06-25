package OopsPractise.GetterAndSetter;

public class Bank {
private String accountNumber;
private int balance;
public  void setaccountNumber(String accountNumber) {
	this.accountNumber =accountNumber;
}
public String getacccountNumber() {
	return accountNumber;
}
public void setbalance(int balance) {
	if(balance >0) {
		this.balance=balance;
	}else {
		System.out.println("Invalid balance !");
	}
}
public int getbalance() {
	return balance;
}
public void deposit(double ammount) {
	if(ammount>=0) {
		balance +=ammount;
	}else {
		System.out.println("Invalid deposit ammount");
	}
	System.out.println("balance ammount after deposit:"+balance);
}
public void withdraw(double ammount) {
	if(balance >=ammount) {
		balance -=ammount;
	}else {
		System.out.println("Insufficent ammount");
	}
	System.out.println("After withdraw current balance :"+balance);
}
}
