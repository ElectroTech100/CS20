package Mastery;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
		        int value;
		        int total = 0;
		        int temp;
		        int num1 = 0;
		        int num2 = 0;
		        
		       // create the scanner
		        Scanner userinput = new Scanner(System.in);
		        
		        System.out.print("Enter a multi-digit Number : ");
		        value = userinput.nextInt();
		        
		    
		        int t = value; 
		            
		        while (num2 > 0) {
		            temp = num1 % num2;  
		            num1 = num2 ;         
		            num2 = temp;       		    
		            
		        }
		            
		        System.out.println("The Sum of the digits is : " + total);

		    }
		
	/*

	 */
		
	}

