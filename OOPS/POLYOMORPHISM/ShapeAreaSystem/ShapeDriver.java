package OOPS.POLYOMORPHISM.ShapeAreaSystem;

import java.util.Scanner;

public class ShapeDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape S = null; //reference variable declaration

        while (true) {   
        	System.out.println("\u001B[34m----------------------------\u001B[0m");
			System.out.println("\u001B[32m🔥 Shape Area System\u001B[0m");
			System.out.println("\u001B[33m1 . Circle Area ●\u001B[0m");
			System.out.println("\u001B[33m2 . Rectangle Area ▭\u001B[0m");
			System.out.println("\u001B[33m3 . Triangle Area ▲\u001B[0m");
			System.out.println("\u001B[34m----------------------------\u001B[0m");
			System.out.print("\u001B[36mChoose option ▶\u001B[0m ");
            int n = sc.nextInt();

            switch (n) {

                case 1: {
                    S = new Circle(sc); //Runtime polymorphism
                    break;
                }

                case 2: {
                    S = new Rectangle(sc); //Runtime polymorphism
                    break;
                }

                case 3: {
                    S = new Triangle(sc); //Runtime polymorphism
                    break;
                }

                default: {
                    System.out.println("----------------------------");
                    System.out.println("\u001B[31m Invalid option choose! \u001B[0m");
                    System.out.println("\u001B[32m Try again... \u001B[0m");
                    continue;  
                }
            }

          

            break; // exit after valid input
        }

       
    }
}
