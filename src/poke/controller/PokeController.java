package poke.controller;


import poke.model.*;
import poke.view.PokeFrame;
import poke.view.PokePanel;
import java.util.ArrayList;

public class PokeController
{
	private ArrayList<Pokemon> pokedex;
	private PokeFrame appFrame;
	private PokePanel appPanel;

	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
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
		
	}
	
	public ArrayList<Pokemon> getPokedex()
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
	
}
