package Skill_builders;

import java.util.Scanner;

public class TimeConverter 
{
	public static void hoursToMin()
	{
		
		// Convert hours to minutes(n1)
		//Declaration
		int hours, minutes;
		
		
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.println("Enter the number of hours: ");
		hours = input.nextInt();
		
		minutes = hours * 60;
		
		System.out.println( "There are "+minutes + " minutes in "+ hours + " hours.");
						
		
	}
	
	//Convert days to hours (n2)
	public static void daysToHours()
	{
		//Declaration
		int days, hours;
			Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter the number of days: ");
		days = input.nextInt();
		

		hours = days * 24;
		
		
		System.out.println( "There are "+hours + " hours in "+ days + " days.");		
		
	}
	
	public static void main(String[] args) 
	{
		int choice;
		
		Scanner input = new Scanner(System.in);
				
		System.out.println( "Please choose one of the following options: ");
		System.out.println( "1. Hours to minutes. ");
		System.out.println( "2. Days to hours. ");
		
		
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
				hoursToMin();
				
			case 2:
				daysToHours();
			
		}

	}

}