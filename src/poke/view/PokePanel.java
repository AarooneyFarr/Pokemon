package poke.view;

import javax.swing.*;
import java.awt.*;
import poke.controller.PokeController;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import poke.model.Pokemon;

import java.awt.Dimension;

public class PokePanel extends JPanel {
	private PokeController baseController;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox<Pokemon> pokedexSelector;
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
	private JLabel backgroundPic;
	private ImageIcon backgroundIcon;

	public PokePanel(PokeController baseController) {
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();

		this.pokedexSelector = new JComboBox<Pokemon>(baseController.getPokedex());
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
		this.backgroundPic = new JLabel(new ImageIcon(PokePanel.class.getResource("/poke/view/images/pokeball.jpeg")),
				JLabel.CENTER);
		
		
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

		} else if (data.contains("Psychic")) {
			this.setBackground(Color.PINK);
		}
		if(data.contains("Steel"))
		{
			
			backgroundPic.setBounds(0, 0, 500, 500);
			changeBackground("Steel.jpg");
			
		}
		else if (data.contains("Water"))
		{
			backgroundPic.setBounds(0, 0, 500, 500);
			changeBackground("Water.png");
		}
		else{
			backgroundPic.setBounds(0, 0, 0, 0);
		}

		repaint();
	}
	
	private void changeBackground(String name) {

		String path = "/poke/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		try {
			backgroundPic.setBounds(0, 0, 500, 500);
			backgroundIcon = new ImageIcon(getClass().getResource(path + name ));
			backgroundPic.setIcon(backgroundIcon);
		} catch (NullPointerException missingFile) {
			backgroundPic.setBounds(0, 0, 0, 0);
		}

		repaint();

	}

	private void changeImageDisplay(String name) {

		String path = "/poke/view/images/";
		String defaultName = "pokeball";
		String extension = ".png";
		try {
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
			pokePicture.setIcon(pokemonIcon);
		} catch (NullPointerException missingFile) {
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + ".jpeg"));
			pokePicture.setIcon(pokemonIcon);
		}

		repaint();

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
		advancedArea.setLineWrap(true);
		advancedArea.setWrapStyleWord(true);
		this.add(pokePicture);
		this.add(updateButton);
		this.setLayout(null);
		this.add(backgroundPic);

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
		backgroundPic.setBounds(0, 0, 0, 0);

	}

	public void setupListeners() {

		pokedexSelector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent selection) {
				int selected = pokedexSelector.getSelectedIndex();
				nameField.setText(baseController.getPokedex().get(selected).getName() + "");
				numberField.setText(baseController.getPokedex().get(selected).getNumber() + "");
				combatField.setText(baseController.getPokedex().get(selected).getAttackPoints() + "");
				speedField.setText(baseController.getPokedex().get(selected).getSpeed() + "");
				healthField.setText(baseController.getPokedex().get(selected).getHitPoints() + "");
				advancedArea.setText(baseController.getPokedex().get(selected).getPokemonInformation() + "\n"
						+ baseController.getPokedex().get(selected).getPokemonTypes());
				changeColorBasedOnData(baseController.getPokedex().get(selected).getPokemonTypes());
				changeImageDisplay(baseController.getPokedex().get(selected).getClass().getSimpleName());

			}
		});

		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = pokedexSelector.getSelectedIndex();

				baseController.updateSelected(selected,Integer.parseInt(healthField.getText()), Integer.parseInt(combatField.getText()), Double.parseDouble(speedField.getText()), nameField.getText(), Integer.parseInt(numberField.getText()), baseController.getPokedex().get(selected).getPokemonTypes() );

			}
		});

		this.addMouseListener(new MouseListener() {
			public void mouseEntered(MouseEvent entered) {

			}

			public void mouseExited(MouseEvent exited) {

			}

			public void mousePressed(MouseEvent pressed) {

			}

			public void mouseReleased(MouseEvent released) {

			}

			public void mouseClicked(MouseEvent clicked) {

			}

		});

	}

}
