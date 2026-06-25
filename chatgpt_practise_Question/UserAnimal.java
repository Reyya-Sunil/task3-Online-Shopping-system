package chatgpt_practise_Question;

public class UserAnimal {
public static void main(String[] args) {
	Animal [] a = new Animal[2];
	a[0]= new  Dog();
	a[1]= new Cat();
	for( Animal arry :a) {
		arry.makeSound();
		
	}
}
}
