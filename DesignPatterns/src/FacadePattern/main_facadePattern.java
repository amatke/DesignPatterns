package FacadePattern;

public class main_facadePattern {

	public static void main(String[] args) {
		
		ShapeMaker maker = new ShapeMaker();
		
		maker.drawCircle();
		maker.drawRectangle();
		maker.drawTriangle();
	}

}
