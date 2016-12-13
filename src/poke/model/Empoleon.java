package poke.model;

public class Empoleon extends Pokemon implements Water{
	
	public Empoleon()
	{
		super(84, 86, 60.0, "Empoleon", 395, "Water");
	}

	public Empoleon(int hitPoints, int attackPoints, double speed, String name, int number, String type)

	{
		super(hitPoints, attackPoints, speed, name, number, type);

	}

	public int whirlpool()
	{
		return 2;
	}

	public int waterGun()
	{
		return this.getAttackPoints() * 2;
	}

}
