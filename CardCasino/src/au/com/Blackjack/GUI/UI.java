package au.com.Blackjack.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;

public class UI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public void init() {
		// Declaring and Instantiating Fields
		// Frame
		JFrame Frame = new JFrame();
		
		// Panels
		JPanel canvasPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		// Buttons
		JButton Hit = new JButton("Hit");
		JButton Stand = new JButton("Stand");
		JButton NewGame = new JButton("Exit");
		
		// Setting the buttons
		Hit.addActionListener(this);
		Stand.addActionListener(this);
		NewGame.addActionListener(this);		
		
		// Placing the Panels and Adding the Buttons
		setBackground(new Color(130,50,40));
		getContentPane().add(canvasPanel, BorderLayout.CENTER);
		
		canvasPanel.setBackground(new Color(220,200,180));
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(Hit);
		buttonPanel.add(Stand);
		buttonPanel.add(NewGame);
		
		// Adding Panel component to the frame
		Frame.add(canvasPanel);
		Frame.add(buttonPanel);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	// Add an anonymous object for the action listeners
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.toString();
		
		if(action.equals("Hit")) {
			// dealer to hit
		} else {
			if(action.equals("Stand")) {
				// next player
			}
			else if(action.equals("Exit")) {
				// Exit the game.
			}
		}
	}
}
