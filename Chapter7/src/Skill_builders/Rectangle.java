package Skill_builders;

public class Rectangle 
{
	private double length;
	private double width;

	//default Contructor Method
	public Rectangle()
	{
		length = 1.0;
		width = 2.5;
	}
	
	// Accessor method
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}

	//modifier method
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	
	public static void displayFormula()
	{
		System.out.println("The Formula for the area" + "of a rectangle is A = l * w");
	}
	
	public String toString()
	{
		return("The length is" + length + "and the width is " + width);
	}
	
	//Area Method
	public double area()
	{
		double rArea;	
		rArea = length * width;
		return rArea;
	}
	//perimeter Method
	public double perimeter()
	{
		double rPer;
		rPer = length + width ;
		return rPer;
	}
	
	
	
	
	
	
	
	
	
}




