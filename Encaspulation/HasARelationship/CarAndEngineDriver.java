package Encaspulation.HasARelationship;

public class CarAndEngineDriver {
public static void main(String[] args) {
	Car c1 = new Car();
	c1.setBrand("R.R");
	System.out.println(c1.getBrand());
	c1.getEngine().setHp(1400);
	System.out.println(c1.getEngine().getHp());
}
}
