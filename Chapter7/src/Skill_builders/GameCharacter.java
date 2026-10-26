package Skill_builders;

public class GameCharacter 
{
	//Declare instance variables
	private String name;
	private int health;
	
	//default constructor
	public GameCharacter()
	{
		name = "";
		health = 0;
	}
	
	
	//Overload Constructor method
	public GameCharacter(String charName, int starHealth)
	{
		name = charName;
		health = starHealth;
	}
	
	//Behaviour: actions the character can do
	//method 1
	 public void attack()
	 {
		 System.out.println(name + "attacks! Deals 10 Damage");
		 
	 }
	//method 2
	public void takedamage(int damage)
	{
		health = health - damage;
		
		if (health > 0)
		{
			health = 0;
			System.out.println(name + "'s health is now " +health);
		}
	}
	
	public string getStatus()
	{
		return name + "has" +health "health.";
	}

	

}
