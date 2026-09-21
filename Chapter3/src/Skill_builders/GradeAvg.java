package Skill_builders;

import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args)
	{
	
		//Declaration
		int Grade1;
		int Grade2;
		int Grade3;
		int Grade4;
		int Grade5;
		
		
		
		
		
		//Create Scanner Object from user
		Scanner userinput = new Scanner(System.in);
		
		
		System.out.print("Enter 1st Grade : ");
		Grade1 = userinput.nextInt();
	
		
		System.out.print("Enter 2nd Grade : ");
		Grade2 = userinput.nextInt();

		
		System.out.print("Enter 3rd Grade : ");
		Grade3 = userinput.nextInt();

		
		System.out.print("Enter 4rth Grade : ");
		Grade4 = userinput.nextInt();

		
		System.out.print("Enter 5th Grade : ");
		Grade5 = userinput.nextInt();
		
		int Average = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5) / 5 ; 
		
		System.out.println("Your Final Average is : " + Average );
		
		
		
		
		
		/*
		 *  Enter 1st Grade : 98
			Enter 2nd Grade : 75
			Enter 3rd Grade : 99
			Enter 4rth Grade : 95
			Enter 5th Grade : 86
			Your Final Average is : 90


		 */
		
			
	}

}
