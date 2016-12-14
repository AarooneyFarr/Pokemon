package poke.model;

import java.util.Scanner;
import java.io.*;



public abstract class Pokemon
{
	private int hitPoints;
	private int attackPoints;
	private double speed;
	private String name;
	private int number;
	private String type;
	private Scanner pokeScanner;
	private File pokeFile;
	private String fileName;
	private String extraInfo;
	
	
	public Pokemon()
	{
		extraInfo = "";
		type = "";
		hitPoints = 0;
		attackPoints = 0;
		speed = 0;
		name = "";
		number = 0;
		fileName = "Poke.txt";
		pokeFile = new File(fileName);
		pokeScanner = new Scanner(fileName);
		
		
	}
	
	public Pokemon(int hitPoints, int attackPoints, double speed, String name, int number, String type)
	{
		this.hitPoints = hitPoints;
		this.attackPoints = attackPoints;
		this.speed = speed;
		this.name = name;
		this.number = number;
		this.type = type;
		fileName = "Poke.txt";
		pokeFile = new File(fileName);
		pokeScanner = new Scanner(fileName);
		
	}
	
	public String toString()
	{
		return this.name;
	}
	
	public String getPokemonInformation()
	{
		
		
		return "";
	}
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "This pokemon has the following type: \n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index< types.length; index++)
		{
			String temp = types[index].getCanonicalName();
			
			pokeTypes[index] = temp;
		}
		
		for(String current : pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp + "\n";
		}
		return pokemonTypes;
	}
	
	public int getAttackPoints()
	{
		return attackPoints;
	}
	
	public int getHitPoints()
	{
		return hitPoints;
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}
	
	public void setPokemonInfo(String extraInfo)
	{
		this.extraInfo = extraInfo;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	
	
	
	
}
