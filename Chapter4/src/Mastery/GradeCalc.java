package Mastery;

import java.util.Scanner;

public class GradeCalc {

	public static void main(String[] args)
	{
	
		//Declaration 
		int copy; 

		//Create Scanner Object from user 
		Scanner userinput = new Scanner(System.in); 
		
		System.out.print("Enter 1st Grade : ");
		int Grade1 = userinput.nextInt();
		System.out.print("Enter 2nd Grade : ");
		int Grade2 = userinput.nextInt();
		System.out.print("Enter 3rd Grade : ");
		int Grade3 = userinput.nextInt();
		System.out.print("Enter 4rth Grade : ");
		int Grade4 = userinput.nextInt();		
		System.out.print("Enter 5th Grade : ");
		int Grade5 = userinput.nextInt();
		int Average = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5) / 5 ; 
		
		System.out.println("Your Final Average is : " + Average );
		
		
		if (Average >= 90 && Average <= 100) {
		    System.out.println("Your Average Grade is a A"); 	
		    System.out.println("Great Job");
		} else if (Average >= 80 && Average <= 89) {
			System.out.println("Your Average Grade is a B"); 	
		    System.out.println("Good job");
		} else if (Average >= 70 && Average <= 79) {
			System.out.println("Your Average Grade is a C"); 	
		    System.out.println("You need to do you homework");
		}else if (Average >= 60 && Average <= 69) {
			System.out.println("Your Average Grade is a D"); 	
		    System.out.println("Your almost failing :(");
		}else {
		    System.out.println("Your Average is an F");
		    System.out.println("Your failing school");
		    
		    }
	    
		/*
		 * 
		 *  Enter 1st Grade : 98
			Enter 2nd Grade : 97
			Enter 3rd Grade : 85
			Enter 4rth Grade : 90
			Enter 5th Grade : 80
			Your Final Average is : 90
			Your Average Grade is a A
			Great Job
			
			or 
			
			Enter 1st Grade : 25
			Enter 2nd Grade : 85
			Enter 3rd Grade : 45
			Enter 4rth Grade : 67
			Enter 5th Grade : 75
			Your Final Average is : 59
			Your Average is an F
			Your failing school
			
			
		 */
	
	
	
	
	
	
	
	
	}
}
