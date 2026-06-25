package constructor_overloading;

public class laptop {
String l_name;
String brand;
int price;
{
	System.out.println("WELECOME TO LAPTOP STORE ");
}
laptop (){
	System.out.println("Non args Constructor");
}
laptop(String l_name){
	this.l_name =l_name;
}
laptop(String l_name,String brand){
	this(l_name);
	this.brand =brand;
}
laptop(String l_name,String brand,int price){
	this (l_name,brand);
	this.price = price;
}
void display(){
	System.out.println("Laptop name :"+l_name);
	System.out.println("brand :"+brand);
	System.out.println("price :"+price);
	System.out.println("Thank you for visiting");
}
{
	System.out.println("Please Take  your choice !");
}
}
