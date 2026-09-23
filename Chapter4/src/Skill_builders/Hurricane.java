package Skill_builders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args)
	{
	
		//Declaration
				int Hcat;
				
				//Create Scanner Object from user
				Scanner userinput = new Scanner(System.in);
				
				
				System.out.print("Enter the Category of the Hurricane from 1 - 5: ");
				Hcat = userinput.nextInt();
				
				switch (Hcat) {
				case 1:
		            System.out.println("Category 1 Wind Speeds: 74-95 mph or 64-82 kt or 119-153 km/hr");
		            System.out.println("Oh No! Get Shelter now!");
		            break;
		        case 2:
		            System.out.println("Category 2 Wind Speeds: 96-110 mph or 83-95 kt or 154-177 km/hr");
		            System.out.println("The Hurricane's getting serious!");
		            break;
		        case 3:
		            System.out.println("Category 3 Wind Speeds:  111-130 mph or 96-113 kt or 178-209 km/hr ");
		            System.out.println("Oh No! Get shelter NOW! Stay Undergrounds!");
		            break;
		        case 4:
		            System.out.println("Category 4 Wind Speeds: 131-155 mph or 114-135 kt or 210-249 km/hr");
		            System.out.println("Your in trouble, Dont go out!");
		            break;
		        case 5:
		            System.out.println("Category 5 Wind Speeds: greater than 155 mph or 135 kt or 249 km/hr ");
		            System.out.println("The Wind is faster than a 8KCAB Private Plane!");
		            break;
				}
		
		
		
		
		
		
		/*
		 Enter the Category of the Hurricane from 1 - 5: 4
		 Category 4 Wind Speeds: 131-155 mph or 114-135 kt or 210-249 km/hr
		 Your in trouble, Dont go out!
		 
		 

		 */
		
			
	}

}
