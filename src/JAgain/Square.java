package JAgain;

public class Square extends Shape {

	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
		
	public double CalculateArea() {
		
		double area=0;
		
		area=this.side*this.side;
		return area;
	
	
	
	
	}
}
