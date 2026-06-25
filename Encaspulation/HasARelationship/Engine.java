package Encaspulation.HasARelationship;

public class Engine {
private double hp;
private double tor;


public double getHp() {
	return hp;
}
public void setHp(double hp) {
	this.hp = hp;
}
public double getTor() {
	return tor;
}
public void setTor(double tor) {
	this.tor = tor;
}
public  Engine (double tor) {
	setTor(tor);
}

}
