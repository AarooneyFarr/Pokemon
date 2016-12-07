package poke.view;

import javax.swing.*;

import poke.controller.PokeController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import poke.model.Pokemon;

import java.awt.Dimension;

public class PokePanel extends JPanel {
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
	private ImageIcon pokemonIcon;

	public PokePanel(PokeController baseController) {
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();

		this.pokedexSelector = new JComboBox(new String[] { "Pikachu", "Aron", "Bulbasaur" });
		this.pokemonLabel = new JLabel("The current pokemon: ");
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
		this.advancedArea = new JTextArea(10, 25);
		this.pokePicture = new JLabel(new ImageIcon(PokePanel.class.getResource("/poke/view/images/pokeball.jpeg")),
				JLabel.CENTER);
		this.updateButton = new JButton("Update");

		setupPanel();
		setupLayout();
		setupListeners();

	}

	private void changeColorBasedOnData(String data) {
		if (data.contains("Grass")) {
			this.setBackground(Color.GREEN);
		} else if (data.contains("Electric")) {
			this.setBackground(Color.YELLOW);

		} else if (data.contains("Water")) {
			this.setBackground(Color.BLUE);

		} else if (data.contains("Rock")) {
			this.setBackground(Color.GRAY);

		}

		repaint();
	}

	private String changeImageDisplay(String name) {
		String path = "/poke/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		try {
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			pokemonLabel.setIcon(pokemonIcon);
		} catch (NullPointerException missingFile) {
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + ".jpeg"));
			pokemonLabel.setIcon(pokemonIcon);
		}
		
		repaint();
		return path + defaultName + extension;
		
	}

	public void setupPanel() {
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
		this.add(pokePicture);
		this.add(updateButton);
		this.setLayout(null);

	}

	public void setupLayout() {
		updateButton.setBounds(105, 449, 54, 53);
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
		numberField.setBounds(164, 89, 74, 20);
		advancedArea.setBounds(16, 210, 212, 225);
		pokePicture.setBounds(244, 210, 225, 225);
		updateButton.setBounds(200, 444, 92, 20);

	}

	public void setupListeners() {
		pokedexSelector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection) {
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName());
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHitPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n"
						+ baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getName());

				

			}
		});
	}

}
