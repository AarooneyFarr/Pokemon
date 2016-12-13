package poke.model;

public class Aron extends Pokemon implements Rock,Steel {

	public Aron()
	{
		super(50, 70, 30.0, "Aron", 304, "Rock, Steel");
	}

	public Aron(int hitPoints, int attackPoints, double speed, String name, int number, String type)

	{
		super(hitPoints, attackPoints, speed, name, number, type);

	}
	
	public int rockBlast()
	{
		return 2;
	};

	public int sandStorm()
	{
		return this.getAttackPoints() * 2;
	};
	
	public int harden()
	{
		return 2;
	};

	public int tackle()
	{
		return this.getAttackPoints() * 2;
	};
}
