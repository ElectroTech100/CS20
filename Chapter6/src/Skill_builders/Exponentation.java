package Skill_builders;

import java.util.Scanner;

public class Exponentation {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Exponentiation: ");
	        
	        
	        System.out.print("Enter the base number: ");
	        double base = input.nextDouble();

	
	        System.out.print("Enter the exponent: ");
	        double exponent = input.nextDouble();

	
	        double result = powerOf(base, exponent);


	        System.out.println("\n" + base + " raised to the power of " + exponent + " is: " + result);

	        input.close();
	    }

	    public static double powerOf(double base, double exponent) {
	        return Math.pow(base, exponent);
	    }
	}
