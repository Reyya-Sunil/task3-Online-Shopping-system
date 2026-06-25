package OopsPractise.GetterAndSetter;

import java.util.Scanner;

public class ATMDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Pin ?:");
		int pin = sc.nextInt();
		ATM A1 = new ATM();
		A1.validatePin(pin);

	

	}

}
