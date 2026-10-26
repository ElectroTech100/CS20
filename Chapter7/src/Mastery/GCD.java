package Mastery;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args)
	{
	
		
		        int temp;
		        int num1;
		        int num2;
		      
		       // create the scanner
		        Scanner userinput = new Scanner(System.in);
		        
		        System.out.print("Enter a Number: ");
		        num1 = userinput.nextInt();
		        
		        System.out.print("Enter a Second Number: ");
		        num2 = userinput.nextInt();
		    
		        while (num2 > 0) {
		            temp = num1 % num2;  
		            num1 = num2 ;         
		            num2 = temp;       		    
		            
		        }
		          
		        System.out.println("The GCD of the numbers is : " + num1);
		        
		    }
		
	/*
	 *  Enter a Number: 12
		Enter a Second Number: 21
		The GCD of the numbers is : 3

		and
		
		Enter a Number: 95
		Enter a Second Number: 24
		The GCD of the numbers is : 1

	 */
		
	}

