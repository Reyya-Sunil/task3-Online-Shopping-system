package AbstractClass_Abstraction.Intermediatelevel;

public class ICICI extends Bank{
double interest;
ICICI(double interest){
	this.interest=interest;
}
public void getInterestRate() {
	System.out.println("ICICI present interest  Rate : "+interest+"%");
}
}
