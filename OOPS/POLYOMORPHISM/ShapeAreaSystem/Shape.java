package OOPS.POLYOMORPHISM.ShapeAreaSystem;

import java.util.Scanner;

public class Shape {

}
class Circle extends Shape{
	   public static final  float pi = 3.14f;
	  Circle(Scanner sc){
		  System.out.println("\u001B[34m----------------------------\u001B[0m");
		  System.out.print("\u001B[33m Enter Radius : \u001B[0m");
		  float r =sc.nextFloat();
		  float res = pi*r*r;
		  System.out.println("\u001B[35m Circle Area is :\u001B[0m "+res);
		  System.out.println("\u001B[34m----------------------------\u001B[0m");
		  System.out.println("\u001B[31m==============================\u001B[0m");
		  System.out.println("\u001B[31m⛔ PROGRAM HAS STOPPED        \u001B[0m");
		  System.out.println("\u001B[31m==============================\u001B[0m");
	  }
		
}
class Rectangle extends Shape{
	Rectangle( Scanner sc){
		System.out.println("\u001B[34m----------------------------\u001B[0m");
		System.out.print("\u001B[33m Enter Rectangle Length : \u001B[0m");
		float length = sc.nextFloat();
		System.out.print(" \u001B[33m Enter Rectangle Width  : \u001B[0m ");
		float width = sc.nextFloat();
		float res = length*width;
		System.out.println("\u001B[35m Rectangle Area is : \u001B[0m"+res);
		System.out.println("\u001B[34m----------------------------\u001B[0m");
		System.out.println("\u001B[31m==============================\u001B[0m");
		System.out.println("\u001B[31m⛔ PROGRAM HAS STOPPED        \u001B[0m");
		System.out.println("\u001B[31m==============================\u001B[0m");
	}
}
class Triangle extends Shape{
	Triangle(Scanner sc ){
		System.out.println("\u001B[34m----------------------------\u001B[0m");
		System.out.print("\u001B[33m Enter Triangle Base : \u001B[0m ");
		float base = sc.nextFloat();
		System.out.print("\u001B[33m Enter Triangle Hight : \u001B[0m ");
		float height =sc.nextFloat();
		double res = (0.5)*base*height;
		System.out.println("\u001B[35m Triangle Area is :  \u001B[0m"+res);
		System.out.println("\u001B[34m----------------------------\u001B[0m");
		System.out.println("\u001B[31m==============================\u001B[0m");
		System.out.println("\u001B[31m⛔ PROGRAM HAS STOPPED        \u001B[0m");
		System.out.println("\u001B[31m==============================\u001B[0m");
	}

}
