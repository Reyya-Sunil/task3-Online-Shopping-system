package OOPS.ENCAPSULATION.Has_Singleton;

public class lazy_insilitaziton {
static  lazy_insilitaziton c;
public  lazy_insilitaziton() {
	System.out.println(" this is the constructor body");
}
public  static  lazy_insilitaziton getInctance() {
	if(c==null) {
		c= new  lazy_insilitaziton();
	}
	return c;
}
static void  display() {
	System.out.println("this is display method");
	
}
}
