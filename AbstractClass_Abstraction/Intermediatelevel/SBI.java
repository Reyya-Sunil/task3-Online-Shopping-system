package AbstractClass_Abstraction.Intermediatelevel;

public class SBI extends Bank{
double interest ;
SBI(double intreset){
	this.interest=intreset;
}

public void getInterestRate() {
	System.out.println("SBI interset Rate : "+interest);
	
}

}
