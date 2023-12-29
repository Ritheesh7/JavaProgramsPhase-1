package finalProject;

public class Square extends Shape {
int length;
	
	public Square(int length )
	{
		// using the below code, we are initialzing the arguments of the constructor
		this.length = length;
		
	}
	public double calculateArea()
	{
		return length*length;
	}
	
	public void displayArea()
	{
		System.out.println( "the area of square is:" + calculateArea());
	}
}
