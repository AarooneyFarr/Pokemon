package poke.controller;


import poke.model.*;
import poke.view.PokeFrame;
import poke.view.PokePanel;
import java.util.Vector;

public class PokeController
{
	private Vector<Pokemon> pokedex;
	private PokeFrame appFrame;
	private PokePanel appPanel;

	public PokeController()
	{
		pokedex = new Vector<Pokemon>();
		appFrame = new PokeFrame(this);
	}
	
	public void start()
	{
		buildPokedex();
	}
	
	private void buildPokedex()
	{
		Pikachu myPikachu = new Pikachu();
		pokedex.add(myPikachu);
		Bulbasaur myBulbasaur = new Bulbasaur();
		pokedex.add(myBulbasaur);
		Empoleon myEmpoleon = new Empoleon();
		pokedex.add(myEmpoleon);
		Abra myAbra = new Abra();
		pokedex.add(myAbra);
		Cubone myCubone = new Cubone();
		pokedex.add(myCubone);
		Aron myAron = new Aron();
		pokedex.add(myAron);
		
	}
	
	public Vector<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokeFrame getBaseFrame()
	{
		return appFrame;
		
	}
	
	public PokePanel getBasePanel()
	{
		return appPanel;
		
	}
	
	public void updateSelected(int selected,int hitPoints, int attackPoints, double speed, String name, int number, String type)
	{
		pokedex.elementAt(selected).setHitPoints(hitPoints);
		pokedex.elementAt(selected).setAttackPoints(attackPoints);
		pokedex.elementAt(selected).setSpeed(speed);
		pokedex.elementAt(selected).setName(name);
		pokedex.elementAt(selected).setType(type);
		
		
		
		
	}
	
}
