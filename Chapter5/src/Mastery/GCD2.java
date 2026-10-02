package Mastery;

import java.util.Scanner;

public class GCD2 {

	public static void main(String[] args)
	{
		        int value;
		        int total = 0;
		        int temp;
		        int num1 = 0;
		        int num2 = 0;
		        
		       // create the scanner
		        Scanner userinput = new Scanner(System.in);
		        
		        System.out.print("Enter a Number: ");
		        num1 = userinput.nextInt();
		        
		        System.out.print("Enter a Second Number: ");
		        num2 = userinput.nextInt();
		    
		        int t = num1;
		        int t2 = num2;
		            
		        while (num2 > 0) {
		            temp = num1 % num2;  
		            num1 = num2 ;         
		            num2 = temp;       		    
		            
		        }
		            
		        System.out.println("The GCD of the numbers is : " + num2);

		    }
		
	/*

	 */
		
	}

