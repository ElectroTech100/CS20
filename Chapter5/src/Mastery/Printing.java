package Mastery;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args)
	{
	
		//Declaration 
		int copy; 

		//Create Scanner Object from user 
		Scanner userinput = new Scanner(System.in); 
		
		System.out.print("Enter the amount of copies you need: ");
		copy = userinput.nextInt();
		
		
		if (copy >= 0 && copy <= 99) {
		    System.out.println("Price per copy is $0.30");
		    double tot1 = copy * 0.30; 
		    System.out.println("Total price is " +tot1);
		} else if (copy >= 100 && copy <= 499) {
		    System.out.println("Price per copy is $0.28");
		    double tot2 = copy * 0.28; 
		    System.out.println("Total price is " +tot2);
		} else if (copy >= 500 && copy <= 749) {
		    System.out.println("Price per copy is $0.27");
		    double tot3 = copy * 0.27; 
		    System.out.println("Total price is " +tot3);
		}else if (copy >= 750 && copy <= 1000) {
		    System.out.println("Price per copy is $0.26");
		    double tot4 = copy * 0.26; 
		    System.out.println("Total price is " +tot4);
		}else {
		    System.out.println("Price per copy is $0.25");
		    double tot5 = copy * 0.25; 
		    System.out.println("Total price is " +tot5);
		    
		    }
	    
		/*
		 * 
		 * Enter the amount of copies you need: 1025
			Price per copy is $0.25  
			Total price is 256.25
			
			and
			
			Enter the amount of copies you need: 215
			Price per copy is $0.28
			Total price is 60.2
			
			
		 */
	
	
	
	
	
	
	
	
	}
}
