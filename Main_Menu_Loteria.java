package Loteria_Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_Menu_Loteria extends JFrame implements ActionListener{
		JButton play_game, instructions, quit; 
		
		public Main_Menu_Loteria() {
			setTitle("Main Menu");
			setBackground(new Color(219,0,0));
	
			play_game = new JButton();
			instructions = new JButton();
			quit = new JButton();
			
			play_game.setText("Play Game");
			instructions.setText("Instructions");
			quit.setText("quit");
			
			play_game.addActionListener(this);
			instructions.addActionListener(this);
			quit.addActionListener(this);
	
			play_game.setBounds(150, 125, 300, 100);
			instructions.setBounds(150, 250, 300, 100);
			quit.setBounds(150, 375, 300, 100);
		
			setLayout(null);
			setSize(600,600);
			setVisible(true);
			add(play_game);
			add(instructions); 
			add(quit); 
			
			
			//pack();
			setLocationRelativeTo(null);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		}	

	public static void main(String[] args) {
		Main_Menu_Loteria menu = new Main_Menu_Loteria();
		menu.setVisible(true); 
	}

	
	
 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == quit) {
			System.out.print("Quit\n");
		}
		
	}
	
	
}
