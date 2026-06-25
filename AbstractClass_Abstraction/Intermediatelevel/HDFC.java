package AbstractClass_Abstraction.Intermediatelevel;

public class HDFC extends Bank{
double interest;
HDFC(double interest){
	this.interest=interest;
}
public void getInterestRate() {
	System.out.println("HDFC Interset Rate : "+interest+"%");
}
}
