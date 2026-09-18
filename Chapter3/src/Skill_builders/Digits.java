package Skill_builders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		//Declaration
		int ones;
		int tens;
		int Hund;
		int num;
		int tensplace;
		int hundsplace;		
				
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
				
		//Get user input
		System.out.print("Enter a 3 digit number:  ");
		num = userinput.nextInt();
				
		// the math
		hundsplace = num / 100 ;
		ones = num - ((num / 10 )* 10);
		tensplace = (num - (hundsplace * 100) - ones) / 10;
		Hund = hundsplace * 100;
		tens = tensplace * 10;
		
		
		
		//Output
		System.out.println("The Hundreds-place of " + num + " is: " + hundsplace + " or " + Hund);
		System.out.println("The tens-place of " + num + " is: " + tensplace + " or " + tens);
	   
	    System.out.println("The ones-place of " + num + " is: " + ones);
			
	    
	    /*
	     *  Enter a 3 digit number:  325
			The Hundreds-place of 325 is: 3 or 300
			The tens-place of 325 is: 2 or 20
			The ones-place of 325 is: 5

	     */

	}

}
