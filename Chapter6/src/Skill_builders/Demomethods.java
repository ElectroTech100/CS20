package Skill_builders;

public class Demomethods 
{
	public static void main(String[] args)
	{
		
	}



	//Method 1 : No parameters, No return Value
	public static void displayMessage()
	{
		System.out.println("Welcome to Math Class");
	
	}
	
	//Method 2 : One Parameter, No return Value
	public static void greetStudent(String name)
	{
		System.out.println("Hello, " + name); //hi
	}
	
	//Method 3 : 2 Parameter, return decimal
			public static int addNumber(int a, int b)
			{
				int sum = a + b;
				return sum;
			}
	
	//Method 4 : 1 Parameter, return decimal
		public static double calculateArea(double radius)
		{
			double area = 3.14 * radius * radius;
			return area;
		}
	
		//Method 5 : 1 Parameter, return decimal
		public static boolean isPassing(int mark)
		{
			return mark >= 50;
		
		}
	
	
}