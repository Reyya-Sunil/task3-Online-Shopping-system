package OOPS.INHERITANCE.Singelton;

public class Developer extends Employee {
String language ;
 void displayDeveloper(String language){
	this.language = language;
	System.out.println("Developer Know language : "+language);
}
}
