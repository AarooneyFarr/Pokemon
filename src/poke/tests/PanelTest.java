package poke.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import poke.controller.PokeController;
import poke.view.PokePanel;


public class PanelTest
{
	private PokePanel testedPanel;
	
	@Before
	public void setUp() throws Exception
	{
		testedPanel = new PokePanel(new PokeController());
	}

	@After
	public void tearDown() throws Exception
	{
		testedPanel = null;
	}

	@Test
	public void testPokemonPanel()
	{
		
	}
	
	@Test
	public void testSetupListeners()
	{
		
	}
	
	@Test
	public void testSetupPanel()
	{
		
	}

}
