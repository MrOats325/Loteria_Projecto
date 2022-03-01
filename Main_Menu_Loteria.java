package Loteria_Project;

import java.awt.*;
import javax.swing.*;

public class Main_Menu_Loteria extends JFrame{
	
public Main_Menu_Loteria() {
	setTitle("Main Menu");
	setPreferredSize(new Dimension(600,600));
	setBackground(new Color(219,0,0));
	setLayout(new GridLayout(4, 1));
	
	JPanel rowOne = new JPanel(new GridLayout(1, 2));
	JPanel rowTwo = new JPanel(new GridLayout(1, 2));
	JPanel rowThree = new JPanel(new GridLayout(1, 2));
	JPanel rowFour = new JPanel(new GridLayout(1, 2));
	
	add(rowOne);
	add(rowTwo); 
	add(rowThree);
	add(rowFour); 
	
	JButton play_game = new JButton();
	JButton instructions = new JButton();
	JButton quit = new JButton();
	
	play_game.setSize(100,50);
	

	rowTwo.add(play_game);
	//add(instructions); 
	//add(quit); 
	
	pack();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);

}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Menu_Loteria menu = new Main_Menu_Loteria();
		menu.setVisible(true); 
	}
	
	
}
