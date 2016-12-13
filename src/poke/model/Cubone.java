package poke.model;

public class Cubone extends Pokemon implements Rock{
	
	public Cubone()
	{
		super(50, 50, 35.0, "Cubone", 104, "Rock");
	}

	public Cubone(int hitPoints, int attackPoints, double speed, String name, int number, String type)

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

}
