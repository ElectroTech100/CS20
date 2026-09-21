package Mastery;

import java.util.Scanner;

public class Sleep {

	public static void main(String[] args)
	{
	
		//Declaration
				int Byear;
				int Bmonth;
				int Bday;
				
				int Cyear;
				int Cmonth;
				int Cday;
				
				
		
		//Create Scanner Object from user
		Scanner userinput = new Scanner(System.in);
	
		System.out.println("Enter your Birthdate: ");
		System.out.print("Year: ");
		Byear = userinput.nextInt();
		System.out.print("Month: ");
		Bmonth = userinput.nextInt();
		System.out.print("Day: ");
		Bday = userinput.nextInt();
		
		
		
		System.out.println("Enter the Current Date: ");
		System.out.print("Year: ");
		Cyear = userinput.nextInt();
		System.out.print("Month: ");
		Cmonth = userinput.nextInt();
		System.out.print("Day: ");
		Cday = userinput.nextInt();

		int Ayear = Cyear - Byear;
		int Amonth = Cmonth - Bmonth;
		int Aday = Cday - Cmonth;
		
		int Days = (Ayear * 365) + (Amonth * 30) + (Aday);
		
		System.out.println("Your age is: " + Ayear + " years, " + Amonth + " months, and " + Aday + " days"); 
		System.out.println("Your Age in Days is : " + Days);
		
		int Hours = Days * 8;
		int Hrs = Days * 24;
		
		System.out.println("You have slept for :" + Hours + " hours  out  of " + Hrs + " hours");
		
		
		
	/*
	 * 		Enter your Birthdate: 
			Year: 2000
			Month: 1
			Day: 1
			Enter the Current Date: 
			Year: 2026
			Month: 9
			Day: 17
			Your age is: 26 years, 8 months, and 8 days
			Your Age in Days is : 9738
			You have slept for :77904 hours  out  of 233712 hours

	 */
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

