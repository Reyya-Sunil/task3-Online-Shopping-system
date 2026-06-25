package OOPS.ENCAPSULATION.Has_Singleton;

public class Eager_insitilaziton {
void display(){
	System.out.println("this is diplay method inside the eager_insitilazaiton");
}
Eager_insitilaziton(){
	System.out.println("this is the constructor inside the eager_insitilazaiton");
}
}
class classoverload {
	Eager_insitilaziton e = new Eager_insitilaziton();
	classoverload(){
		e.display();
		System.out.println("this is classoverload constructor ");
	}
	
	
}

