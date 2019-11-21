package FactoryDesign.example2;

public class ShapeFactory {
	
	public Shape getShape(String instanceName) {
		if(instanceName.contains("Circle")) {
			return new Circle();
		}
		else if(instanceName.contains("Triangle")) {
			return new Triangle();
		}
		else if(instanceName.contains("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
