package Loteria_Project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;


public class Main_Menu_Loteria extends JFrame implements ActionListener{
		JButton play_game, instructions, quit; 
		Color realRed = new Color(219,0,0);
		
		public Main_Menu_Loteria() {
			setTitle("Main Menu");
	
			play_game = new JButton();
			instructions = new JButton();
			quit = new JButton();
			
			play_game.setText("Play Game");
			instructions.setText("Instructions");
			quit.setText("Quit");
			
			play_game.setFont(new Font("Comic Sans", Font.BOLD, 25)); 
			instructions.setFont(new Font("Comic Sans", Font.BOLD, 25)); 
			quit.setFont(new Font("Comic Sans", Font.BOLD, 25)); 
			
			play_game.setHorizontalTextPosition(JButton.CENTER);
			instructions.setHorizontalTextPosition(JButton.CENTER);
			quit.setHorizontalTextPosition(JButton.CENTER);
			
			play_game.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)); 
			instructions.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)); 
			quit.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED)); 
			
			
			
			play_game.addActionListener(this);
			instructions.addActionListener(this);
			quit.addActionListener(this);
	
			play_game.setBounds(150, 125, 300, 100);
			instructions.setBounds(150, 250, 300, 100);
			quit.setBounds(150, 375, 300, 100);
			
			
			setBackground(realRed);
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
			System.exit(98);
		}
		
		if(e.getSource() == play_game) {
			//Loteria_Game_Beta.changeFrame(2);
			
		}
		
		if(e.getSource() == instructions) {
		
			JFrame instructo = new JFrame(); 
			instructo.setSize(700,300);
			instructo.setLocationRelativeTo(null);
			instructo.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			instructo.setVisible(true);
			
			
			
		}
		
	}
	
	
}
