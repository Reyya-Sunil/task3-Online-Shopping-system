package OOPS.ENCAPSULATION.datahinding;

public class shoe {
private  String brand;
private int Price;
public void setPrice(int price) {
	this.Price=price;
}
public void setbrand (String brand) {
	this.brand =brand;
}
public String getbrand() {
	return brand;
}
public int getPrice() {
	return Price;
}
shoe(){
	
}
shoe(String brand,int price){
setbrand(brand);
setPrice(price);
}
}
