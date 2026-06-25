package Object;

public class BankAccount {
 long accountnumber =23456782;
 long balance;

 public void deposit(int input ) {
	 balance +=input;
	 System.out.println("Account Number :"+accountnumber);
	 System.out.println("Account balance after deposit :"+balance);
 }
 public void withdraw(int input) {
	 balance -= input;
	 System.out.println("Account balance after withdraw :"+balance);
	 
 }
 public static void main(String[] args) {
	 BankAccount b = new BankAccount();
	 b.deposit(40000);
	 b.withdraw(20000);
}
 
}
