package Skill_builders;

import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		//Declaration
		int l;
		int w;
		int h;
		
		
		//Create Scanner object
		Scanner userinput = new Scanner(System.in);
		
		//Get input from user for L,w,h
		System.out.print("Enter the Lenght: ");
		l = userinput.nextInt();
		
		System.out.print("Enter the Width: ");
		w = userinput.nextInt();
	    
		System.out.print("Enter the Height: ");
		h = userinput.nextInt();
		
		//tells them if size is too big.
		if (l > 10) //too big
			System.out.println("The Length is Too Big!");
		else  //Good enough
			System.out.println("The Lenght is Accepted");
		
		if (w > 10) //too big
			System.out.println("The Width is Too Big!");
		else  //Good enough
			System.out.println("The Width is Accepted");
		
		if (h > 10) //too big
			System.out.println("The Height is Too Big!");
		else  //Good enough
			System.out.println("The Height is Accepted");
		
		
		
		
		
		
		
		
		/*
	     *Enter the Lenght: 15
		  Enter the Width: 2
		  Enter the Height: 8
		  The Length is Too Big!
		  The Width is Accepted
		  The Height is Accepted
	     */

	}

}
