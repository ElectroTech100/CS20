package Skill_builders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		//Declaration
		int ones;
		int tens;
		int num;
		int tensplace;
				
				
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
				
		//Get user input
		System.out.print("Enter a 2 digit number:  ");
		num = userinput.nextInt();
				
		// the math
		tens = (num / 10) * 10;
		tensplace = num / 10;
		ones = num - (tensplace * 10);
		
		//Output
	    System.out.println("The tens-place of " + num + " is: " + tensplace + " or " + tens);
	    System.out.println("The ones-place of " + num + " is: " + ones);
				

	}

}
