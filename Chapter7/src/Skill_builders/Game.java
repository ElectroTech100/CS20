package Skill_builders;

public class Game 
{
	public static void main(String[] args)
	{
		//instance 1
		GameCharacter ply1 = new GameCharacter("Hull" , 100);
		
		//instance 2 
		GameCharacter ply2 = new GameCharacter("Villian" , 75);
		
		
		ply1.attack(); //Behavior - calls a method
		
		ply2.takedamage(20); 
		
		System.out.println(ply1.getStatus());
		System.out.println(ply2.getStatus());
		
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
}
	

	
	


