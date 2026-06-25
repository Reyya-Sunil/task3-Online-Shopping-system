package constructor_overloading;

public class This_Call {
String name ;
int id;
int age;
String dept;
This_Call(){
	
}
This_Call(String name){
	this.name = name;
	
}
This_Call(String name, int id){
	this (name);
	this.id = id;
	
}
This_Call(String name, int id , int age){
	this(name,id);
	this.age=age;
}
This_Call(String name,int id , int age, String dept){
	this(name,id,age);
   this.dept = dept;
}

}
