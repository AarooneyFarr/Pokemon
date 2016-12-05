package poke.model;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super(35, 55, 90.0, "Pikachu", 25, "Electric");
	}

	public Pikachu(int hitPoints, int attackPoints, double speed, String name, int number, String type)

	{
		super(hitPoints, attackPoints, speed, name, number, type);

	}

	public int staticZap()
	{
		return 2;
	}

	public int thunder()
	{
		return this.getAttackPoints() * 2;
	}

}
