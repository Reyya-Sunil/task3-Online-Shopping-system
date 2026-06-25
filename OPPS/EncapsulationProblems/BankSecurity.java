package OPPS.EncapsulationProblems;

public class BankSecurity {
private int balance;
public void setBalance(int balance) {
	this.balance=balance;
}
public int getBalance() {
	return balance;
}
public void deposit(int input) {
	balance +=input;
	System.out.println("After deposit balance : "+balance);
}
public void withdraw(int input) {
	balance -= input;
	System.out.println("After withdraw money :"+balance);
	
}

public static void main(String[] args) {
	BankSecurity b = new BankSecurity();
	b.setBalance(4000);
	b.deposit(40000);
	b.withdraw(20000);
}
}
