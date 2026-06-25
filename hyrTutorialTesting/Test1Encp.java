package hyrTutorialTesting;

public class Test1Encp {
private int RollNumber;
private String Name;
private boolean isAttend;
public Test1Encp (int RollNumber) {
	this.RollNumber =RollNumber;
}
public void setAttendence(boolean flag) {
	if(flag == true ) {
		System.out.println("Now theacher assignde attendence");
		this.isAttend = flag;
		
	}else {
		System.out.println("Not assinged the attendce");
	}
	
}
public boolean getAttendence() {
	System.out.println("Techer ascces the attendence : "+isAttend);

	return  isAttend;

}
}
