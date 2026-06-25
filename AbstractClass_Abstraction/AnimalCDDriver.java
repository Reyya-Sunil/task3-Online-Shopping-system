package AbstractClass_Abstraction;

import OOPS.INHERITANCE.Hierarchicalinheritance.main;

public class AnimalCDDriver {
public static void main(String[] args) {
	Animal  a= new Dog();
	a.makeSound();
	Animal b = new Cat();
	b.makeSound();
}
}
