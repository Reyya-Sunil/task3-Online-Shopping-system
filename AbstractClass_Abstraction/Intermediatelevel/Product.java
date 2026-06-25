package AbstractClass_Abstraction.Intermediatelevel;

public abstract class Product {
	double price;
Product(double price){
	this.price= price;
}
abstract double calculateDiscount();
}
