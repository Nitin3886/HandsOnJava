interface Shape { 
	double calculateArea();
} 
class Circle implements Shape { 
	private double radius; 
	public Circle(double radius) { this.radius = radius; }  
	public double calculateArea() 
	{ 
		return Math.PI * radius * radius; 
	} 
}
class Rectangle implements Shape { 
	private double length; 
	private double width; 
	public Rectangle(double length, double width) 
	{ 
		this.length = length; 
		this.width = width; 
	} 
	public double calculateArea() { return length * width; } 
} 
public class CalculateAreaByAbstract { 
	public static void main(String[] args) 
	{ 
		Circle myCircle = new Circle(5.0); 
		Rectangle myRectangle = new Rectangle(4.0, 6.0);  
		System.out.println("Area of Circle: "
						+ myCircle.calculateArea()); 
		System.out.println("Area of Rectangle: "
						+ myRectangle.calculateArea()); 
	} 
}
