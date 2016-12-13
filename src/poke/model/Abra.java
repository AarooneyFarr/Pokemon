package poke.model;

public class Abra extends Pokemon implements Psychic{
	
	public Abra()
	{
		super(25, 20, 90.0, "Abra", 63, "Psychic");
	}

	public Abra(int hitPoints, int attackPoints, double speed, String name, int number, String type)

	{
		super(hitPoints, attackPoints, speed, name, number, type);

	}

	public int calmMind()
	{
		return 2;
	}

	public int psyShock()
	{
		return this.getAttackPoints() * 2;
	}

}
