package Skill_builders;

import java.util.Scanner;

public class RandNum {

	public static void main(String[] args)
	{
	
		//Declaration
		int min, max;
		
		//Create Scanner
		Scanner userinput = new Scanner(System.in);
		
		//Prompt the user for min & max number
		System.out.print("Enter a minimum number:  ");
		//Store min & max number
		min = userinput.nextInt();
		
		System.out.print("Enter a maxmimum number:  ");
		max = userinput.nextInt();
		
		//Generate the Random number
		System.out.println("Random number : " +(int)((max - min + 1 ) * Math.random()+min));
		
		
		
	
		
	}

}
