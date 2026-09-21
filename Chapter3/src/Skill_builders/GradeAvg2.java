package Skill_builders;

import java.util.Scanner;

public class GradeAvg2 {

	public static void main(String[] args)
	{
	
		//Declaration
		int Grade1;
		int Grade2;
		int Grade3;
		int Grade4;
		int Grade5;
		
		int Avg1;
		int Avg2;
		int Avg3;
		int Avg4;
		
		
		
		//Create Scanner Object from user
		Scanner userinput = new Scanner(System.in);
		
		
		System.out.print("Enter 1st Grade : ");
		Grade1 = userinput.nextInt();
		
		Avg1 = Grade1 / 1;
		
		System.out.println("Current Average : " +Avg1);
		
		System.out.print("Enter 2nd Grade : ");
		Grade2 = userinput.nextInt();
		
		Avg2 = (Grade1 + Grade2) / 2;	
		
		System.out.println("Current Average : " +Avg2);
		
		System.out.print("Enter 3rd Grade : ");
		Grade3 = userinput.nextInt();
		
		Avg3 = (Grade1 + Grade2 + Grade3) / 3;	
		
		System.out.println("Current Average : " +Avg3);
		
		System.out.print("Enter 4rth Grade : ");
		Grade4 = userinput.nextInt();
		
		Avg4 = (Grade1 + Grade2 + Grade3+ Grade4) / 4;
		
		System.out.println("Current Average : " +Avg4);
		
		System.out.print("Enter 5th Grade : ");
		Grade5 = userinput.nextInt();
		
		int Average = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5) / 5 ; 
		
		System.out.println("Your Final Average is : " + Average );
		
		
		
		
		
		/*
		 * ScreenDump
		  	
		 * Enter 1st Grade : 55
			Current Average : 55
			Enter 2nd Grade : 13
			Current Average : 34
			Enter 3rd Grade : 99
			Current Average : 55
			Enter 4rth Grade : 99
			Current Average : 66
			Enter 5th Grade : 99
			Your Final Average is : 73

		 */
		
			
	}

}

