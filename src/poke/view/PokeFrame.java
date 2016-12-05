package poke.view;

import javax.swing.JFrame;
import java.awt.Color;

import java.awt.Dimension;

import poke.controller.PokeController;

public class PokeFrame extends JFrame
{
	private PokeController baseController;
	private PokePanel appPanel;
	
	
	public PokeFrame(PokeController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new PokePanel(baseController);
		
		setupFrame(500,500);
		setupListeners();
	}
	
	private void setupFrame(int width, int height)
	{
		this.setContentPane(appPanel);
		this.setTitle("Pokemon");
		this.setSize(new Dimension(width, height));
		this.setVisible(true);
		this.setBackground(Color.GREEN);
	}
	
	private void setupListeners()
	{
		this.addWindowListener(new java.awt.event.WindowAdapter()
		{
			
		@Override
		public void windowClosing(java.awt.event.WindowEvent windowEvent)
		{
			System.exit(0);
		}
				
			
				
		});
	}
}
