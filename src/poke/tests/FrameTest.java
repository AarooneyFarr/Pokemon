package poke.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import poke.view.*;
import poke.controller.PokeController;


public class FrameTest
{

	private PokeFrame testedFrame;
	@Before
	public void setUp() throws Exception
	{
		testedFrame = new PokeFrame(new PokeController());
	}

	@After
	public void tearDown() throws Exception
	{
		testedFrame = null;
	}

	@Test
	public void testPokemonFrame()
	{
		assertTrue("There is no reason to fail this test", true);
	}
	
	@Test
	public void testSetupFrame()
	{
		assertNotNull("You need a title", testedFrame.getTitle());
		assertTrue("Your title needs a reference to Pokemon", testedFrame.getTitle().contains("Pokemon"));
		assertTrue("You need a PokemonPanel inside the frame", testedFrame.getContentPane() instanceof PokePanel);
	}

}
