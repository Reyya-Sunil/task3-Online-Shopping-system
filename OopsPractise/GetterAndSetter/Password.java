package OopsPractise.GetterAndSetter;

public class Password {
private String username;
private String password ="Sunil@2005";
private String input;
public void setusername(String username) {
	this.username=username;
}
public String getusername() {
	return username;
}
public void setpassword(String password) {
	if(password.length()>=8) {
	
		this.password =password;
	}else{
		System.err.println("Password Must be Atleast 8 character !");
	}
}
public String getpassword() {
	return password;
}
public boolean checkpassword(String input) {
	boolean isTrue =false;
	if(input.length()>=8) {
		
		this.input =input;
	}else{
		System.err.println("Password Must be Atleast 8 character !");
	}
	if(input != null && password.equals(input)) {
		 isTrue = true;
	}else {
		 isTrue = false;
	}

	return isTrue;
}
}
