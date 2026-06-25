package StaticVariable_and_NonStaticMethod;

public class BankDriver {
	public static void main(String[] args) {
		  Bank b = new Bank();

	        System.out.println("Customer Details");
	        b.printCustomerDetails();

	        System.out.println("IFSC details ");
	        b.printIFSCDetails();

	        System.out.println("Bank Details");
	        b.printBankDetails();

	        System.out.println("Account Holder Details ");
	        b.printAccountHolderDetails();
	    }
	}

