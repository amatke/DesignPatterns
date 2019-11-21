package FacadePattern;

public class ShapeMaker {

	private Circle circle;
	private Rectangle rectangle;
	private Triangle triangle;
	
	public ShapeMaker() {
		this.circle = new Circle();
		this.rectangle = new Rectangle();
		this.triangle = new Triangle();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawTriangle() {
		triangle.draw();
	}
}
