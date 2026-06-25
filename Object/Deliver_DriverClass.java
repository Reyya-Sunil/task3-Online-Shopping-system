package Object;

public class Deliver_DriverClass {

	public static void main(String[] args) {
		Delivery_Application app = new Delivery_Application();
		
		Delivery_Application.customer c = app.new customer();
		Delivery_Application.Deliver d = app.new Deliver();
		Delivery_Application.Product P = app.new Product();
		Delivery_Application.Seller S = app.new Seller();
		c.CId =145;
		c.CName ="Sunil";
		c.CEmail ="reyyaSunil86@gmail.com";
		d.DId =135;
		d.DName="Harish";
		d.Rating= 5;
		P.Pid=178;
		P.Pname="Laptop";
		P.Pprice=75000;
		S.SId = 675;
		S.SName ="Ankit";
		S.rating =9;
		System.out.println("Customer Id :"+c.CId);
		System.out.println("Customer Name :"+c.CName);
		System.out.println("Customer Email :"+c.CEmail);

	}

}
