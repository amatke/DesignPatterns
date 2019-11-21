package FactoryDesign.example2;

import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {

		Shape shape;
	    ShapeFactory shapeFactory = new ShapeFactory();
	    
	    Scanner sc = new Scanner(System.in);
	    String inputValue;
		
		while(true) {
		    System.out.println("Draw: 1.Circle  2.Rectangle  3.Triangle");
		    inputValue = sc.nextLine();
		    
			if(inputValue.contains("1")) {
				shape = shapeFactory.getShape("Circle");
				shape.draw();
			} 
			else if(inputValue.contains("2")) {
				shape = shapeFactory.getShape("Rectangle");
				shape.draw();
			} 
			else if(inputValue.contains("3")) {
				shape = shapeFactory.getShape("Triangle");
				shape.draw();
			} else {
				System.out.println("Exit drawing app");
				return;
			}
		}
		
	      

		
	}

}
