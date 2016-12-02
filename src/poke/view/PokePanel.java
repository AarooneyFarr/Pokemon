package poke.view;


import javax.swing.*;

import chat.view.ChatPanel;
import poke.controller.PokeController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import poke.model.Pokemon;

import java.awt.Dimension;


public class PokePanel extends JPanel
{
	private PokeController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel pokemonLabel;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel advancedLabel;
	private JLabel pokePicture;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokePanel(PokeController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		
		
		this.pokedexSelector = new JComboBox(new String [] {"poke1", "poke2", "poke3"});
		this.pokemonLabel =new JLabel("The current pokemon: ");
		this.healthLabel = new JLabel("Health Points: ");
		this.combatLabel = new JLabel("Combat Points: ");
		this.speedLabel = new JLabel("Speed Rate: ");
		this.nameLabel = new JLabel("My name is: ");
		this.numberLabel = new JLabel("Pokemon number: ");
		this.advancedLabel = new JLabel("Advanced Information: ");
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.nameField = new JTextField(25);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		//this.pokePicture = new JLabel(new ImageIcon(PokePanel.class.getResource("/poke/view/images/chatbot.png")), JLabel.CENTER);
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{
		this.setBackground(Color.GRAY);
		this.add(updateButton);
		this.add(pokedexSelector);
		this.add(pokemonLabel);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(speedField);
		this.add(combatField);
		this.add(nameField);
		this.add(numberField);
		this.add(advancedArea);
		this.setLayout(null);
		
	}
	public void setupLayout()
	{
		updateButton.setBounds(196, 448, 88, 29);
		pokedexSelector.setBounds(164, 7, 120, 20);
		pokemonLabel.setBounds(6, 6, 161, 20);
		healthLabel.setBounds(260, 50, 92, 20);
		combatLabel.setBounds(260, 89, 120, 20);
		speedLabel.setBounds(260, 132, 92, 20);
		nameLabel.setBounds(34, 50, 92, 20);
		numberLabel.setBounds(34, 89, 130, 20);
		advancedLabel.setBounds(6, 178, 147, 20);
		healthField.setBounds(360, 50, 92, 20);
		speedField.setBounds(360, 132, 92, 20);
		combatField.setBounds(360, 89, 92, 20);
		nameField.setBounds(119, 50, 109, 20);
		numberField.setBounds(164, 88, 74, 20);
		advancedArea.setBounds(16, 210, 436, 214);
		

	}
	public void setupListeners()
	{
		
	}
	
}
