package Skill_builders;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		//Declaration
		int num;
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
				
		//Get user input
		System.out.print("Enter an integer:  ");
		num = userinput.nextInt();
				
		//the math
		int root = (int)Math.sqrt(num);
		
		//check and display
		if (root * root == num) {
			System.out.print("Your number " + num + " is a perfect square");
		} else {
			System.out.print("Your number " + num + " is not a perfect square");
		}
		
	}


	 /*
     *  Enter an integer:  -5
		Your number -5 is not a perfect square
		
		Enter an integer:  25
		Your number 25 is a perfect square
		
		Enter an integer:  56
		Your number 56 is not a perfect square

     */
	
	
}
			
	    
	   




