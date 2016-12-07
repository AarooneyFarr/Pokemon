package poke.tests;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import poke.controller.PokemonController;
import poke.model.Pokemon;
import poke.view.PokemonFrame;

public class ControllerTest
{
	private PokemonController testedController;
	
	@Before
	public void setUp() throws Exception
	{
		testedController = new PokemonController();
	}

	@After
	public void tearDown() throws Exception
	{
		testedController = null;
	}

	@Test
	public void testPokemonController()
	{
		assertTrue("PokemonController exists", testedController != null);
	}
	
	@Test
	public void testUpdateSelected()
	{
		assertTrue("Pokedex has something in it", testedController.getPokedex().size() > 0);
		assertFalse("Pokemon need real names", testedController.getPokedex().get(0).getName().equals(""));
		testedController.updateSelected(0, "JUnit", 0, 0, .0);
		assertTrue("Update method failed", testedController.getPokedex().get(0).getName().equals("JUnit"));
	}

	@Test
	public void testGetPokedex()
	{
		assertNotNull("The pokedex should not be null!", testedController.getPokedex());
		assertTrue("The pokedex should be of type List", testedController.getPokedex() instanceof List);
		assertTrue("The pokedex should have at least 6 pokemon", testedController.getPokedex().size() > 5);
		assertTrue("The pokedex should hold pokemon", testedController.getPokedex().get(0) instanceof Pokemon);
	}

	@Test
	public void testGetBaseFrame()
	{
		assertNotNull("You need an instance of PokemonFrame", testedController.getBaseFrame());
		assertTrue("Your baseFrame needs to be of type PokemonFrame", testedController.getBaseFrame() instanceof PokemonFrame);
	}

	@Test
	public void testPokemonDiversity()
	{
		ArrayList<String > tempList = new ArrayList<String>();
		int implemented = 0;
		
		for(int index = 0; index < testedController.getPokedex().size();  index++)
		{
			if(!tempList.contains(testedController.getPokedex().get(index).getClass().getName()))
			{
				tempList.add(testedController.getPokedex().get(index).getClass().getName());
			}
			if(testedController.getPokedex().get(index).getClass().getInterfaces().length > 1)
			{
				implemented++;
			}
			
		}
		
		assertTrue("Not enough types of Pokemon in your Pokedex", tempList.size() >= 5);
		assertTrue("No class implements at least two different interfaces :(", implemented > 0);
	}
	
	
	
}
