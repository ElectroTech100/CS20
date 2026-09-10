package Skill_builders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args)
	{
	
		//Declaration
		int length;
		int width ;
		
		//Create Scanner Object from user
		Scanner userinput = new Scanner(System.in);
		
		//Get the length from the keyboard
		System.out.print("Enter length : ");
		length = userinput.nextInt();
		
		//Get the length from the keyboard
		System.out.print("Enter Width : ");
		width = userinput.nextInt();
		
		//Display the length and with
		System.out.print("Length is : " + length);
		System.out.print("Width is : " + width);
	}

}
