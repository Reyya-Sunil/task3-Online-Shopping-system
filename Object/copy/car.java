package Object.copy;

public class car {
	String brand;
    String model;
    float price;
public static void main(String[] args) {
	car c1 = new car();
	c1.brand="Maruti Suzuki";
	c1.model ="Hatchback";
	c1.price = 5.8f;
	System.out.println("BRAND :"+c1.brand);
	System.out.println("MODEL : "+c1.model);
	System.out.println("PRICE :"+c1.price+"LAKH");
	System.out.println("----------------------------------------------");
	car c2 = new car();
	c2.brand="Tata Puch";
	c2.model ="Mini SUV";
	c2.price = 5.6f;
	System.out.println("BRAND :"+c2.brand);
	System.out.println("MODEL : "+c2.model);
	System.out.println("PRICE :"+c2.price+"LAKH");
	System.out.println("------------------------------------");
	car c3 = new car();
	c3.brand="Hyundai i20";
	c3.model ="Premium Hatchback";
	c3.price = 7.1f;
	System.out.println("BRAND :"+c3.brand);
	System.out.println("MODEL : "+c3.model);
	System.out.println("PRICE :"+c3.price+"LAKH");
	System.out.println("-------------------------------------------");
}
}
