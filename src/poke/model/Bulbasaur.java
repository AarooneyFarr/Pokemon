package poke.model;

public class Bulbasaur extends Pokemon implements Grass 
{

	public Bulbasaur()
	{
		super(45, 49, 45.0, "Bulbasaur", 1, "Grass");
	}

	public Bulbasaur(int hitPoints, int attackPoints, double speed, String name, int number, String type)

	{
		super(hitPoints, attackPoints, speed, name, number, type);

	}

	public int razorLeaf() {
		return 2;
	}

	public int solarBlade() {
		return this.getAttackPoints() * 2;
	}

}
