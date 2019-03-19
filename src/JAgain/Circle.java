package JAgain;

public  class Circle extends Shape {

	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double CalculateArea() {
	
		double area=0;
		
		area=3.14*this.radius*this.radius;
		return area;
	
}
}