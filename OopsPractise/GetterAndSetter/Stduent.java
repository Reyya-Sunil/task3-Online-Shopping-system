package OopsPractise.GetterAndSetter;

public class Stduent {
 private String name;
 private int age;
 private int marks;

public void setname(String name) {
	this.name = name;
	
	
}
public void setage(int age) {
	if(age>0) {
	this.age=age;
	}else {
		System.out.println("AGE NOT VALID !");
	}
	
	
}
public void setmarks(int marks) {
	if(marks >= 0 && marks<=100) {
	this.marks=marks;
	
	
}else {
	System.out.println("Marks Out of Range (0-100) !");
}
}
public String getname() {
	return name;
}
public int  getage() {
	return age;
}
public int getmarks() {
	return marks;
}
}
