package Skill_builders;

import java.util.Scanner;

public class Exponentation {

	public static void main(String[] args)
	{
	
		int maxValue;
		
		int newValue = 1;
		int added = 0;
		//Create Scanner
		Scanner userinput = new Scanner(System.in);
		
		
		System.out.print("Enter a Maximum Number : ");
		
		maxValue = userinput.nextInt();
			
			while (newValue <= maxValue)
			{
				
				added += newValue;
				newValue += 1; 
				
				
				System.out.println("The Sum of the numbers is : " +added);
			}
			
		
	}

}
