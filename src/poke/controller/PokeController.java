package poke.controller;


import poke.model.Pokemon;
import poke.view.PokeFrame;
import poke.view.PokePanel;

public class PokeController
{
	private Pokemon pokemon;
	private PokeFrame appFrame;
	private PokePanel appPanel;

	public PokeController()
	{
		pokemon = new Pokemon();
		appFrame = new PokeFrame(this);
	}
	
	public void start()
	{
		
	}
}
