package Mastery;

import java.util.Scanner;

public class Digitsum {

	public static void main(String[] args)
	{
		        int value;
		        int total = 0;
		        
		       // create the scanner
		        Scanner userinput = new Scanner(System.in);
		        
		        System.out.print("Enter a multi-digit Number : ");
		        value = userinput.nextInt();
		        
		    
		        int t = value; 
		            
		        while (t > 0) {
		            int digit = t % 10;  
		            total += digit;         
		            t = t / 10;       		    
		            
		        }
		            
		        System.out.println("The Sum of the digits is : " + total);

		    }
		
	/*
	 * Enter a multi-digit Number : 123
	   The Sum of the digits is : 6
	   
	   and
	   
	   Enter a multi-digit Number : 2536
	   The Sum of the digits is : 16

	 */
		
	}

