package constructor;

public class ConstructorOverloading {
String name;
int price;
ConstructorOverloading(){
	this.name ="Unknown";
	this.price =0;
	System.out.println(name);
	System.out.println(price);
}
ConstructorOverloading(String name, int price){
	this.name =name;
	this.price = price;
	System.out.println(name);
	System.out.println(price);
	
}
}
