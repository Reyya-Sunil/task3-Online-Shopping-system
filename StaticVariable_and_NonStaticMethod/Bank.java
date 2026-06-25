package StaticVariable_and_NonStaticMethod;


	class Bank {

	    static String bankName = "State Bank of India";
	    static String accHolderName = "Sunil";
	    static long accNo = 1234567890;
	    static String branch = "Mumbai";
	    static String ifsc = "SBIN0001234";

	
	    void printCustomerDetails() {
	        System.out.println("Customer Name: " + accHolderName);
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("Branch: " + branch);
	        System.out.println("IFSC Code: " + ifsc);
	    }

	    void printIFSCDetails() {
	        System.out.println("IFSC Code: " + ifsc);
	    }

	    void printBankDetails() {
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("Branch: " + branch);
	    }

	    void printAccountHolderDetails() {
	        System.out.println("Account Holder Name: " + accHolderName);
	        System.out.println("Account Number: " + accNo);
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("IFSC Code: " + ifsc);
	    }

	}

