package Skill_builders;

public class Circle 
{
	private static final double PI = 3.14;
	private double radius;

	//default Contructor Method
	public Circle()
	{
		radius = 1.0;
	}
	
	// accesor method
	public double getRadius()
	{
		return radius;
	}

	//modifier method
	public void setRadius(double r)
	{
		radius = r;
	}
	
	public static void displayFormula()
	{
		System.out.println("The Formula for the area" + "of a circle is A = PI * r^2");
	}
	
	public String toString()
	{
		return("The Radius is: "+ radius);
	}
}




