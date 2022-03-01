package Loteria_Project;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 


import Loteria_Project.*;


 

public class Loteria_Game_Beta extends JFrame implements ActionListener{
 

public Loteria_Game_Beta() {
	setTitle("Loteria");
	setLayout(new GridLayout(6, 1));
	setPreferredSize(new Dimension(750,900)); 
	Color realRed = new Color(219,0,0);
	
	
	
	JPanel rowOne = new JPanel(new GridLayout(1, 2));
	JPanel rowTwo = new JPanel(new GridLayout(1, 2));
	JPanel rowThree = new JPanel(new GridLayout(1, 2));
	JPanel rowFour = new JPanel(new GridLayout(1, 2));
	JPanel rowFive = new JPanel(new GridLayout(1, 2));
	JPanel rowSix = new JPanel(new GridLayout(1, 2));
	
	
	
	add(rowOne);
	add(rowTwo); 
	add(rowThree);
	add(rowFour); 
	add(rowFive);
	add(rowSix);
	
	
	Loteria_Cards loteria = new Loteria_Cards();
	loteria.shuffle();
	
	//loteria.shuffle();
	
	SortedABList<Loteria> dealer = new SortedABList();
	SortedABList<Loteria> board = new SortedABList();
	
	//dealer.add(loteria.nextCard());
	
	for (int i = 0; i < 16; i++) {
		board.add(loteria.nextCard());
	}
	
	
	Loteria card; 

	//for (int i = 0; i < dealer.size(); i++) {
		//Loteria card;
		//card = dealer.get(i);
		//JLabel labelOne = new JLabel();
		//labelOne.setIcon(card.getImage());
		//rowOne.add(labelOne);
		
	//}

	
	rowOne.setBackground(realRed);
	rowOne.setOpaque(true);
	
	
	//Loteria Row 1 
	ImageIcon cactus = new ImageIcon("src/Loteria_Project/LoteriaPDF/sombrero.png");	
	JLabel beanOneRowOne = new JLabel(cactus);
	beanOneRowOne.setBackground(realRed);
	beanOneRowOne.setOpaque(true);
	rowTwo.add(beanOneRowOne);
	JButton r1c1 = new JButton(board.get(0).getImage());
	JButton r1c2 = new JButton(board.get(1).getImage()); 
	JButton r1c3 = new JButton(board.get(2).getImage());
	JButton r1c4 = new JButton(board.get(3).getImage());
	rowTwo.add(r1c1); 
	rowTwo.add(r1c2); 
	rowTwo.add(r1c3); 
	rowTwo.add(r1c4); 
	JLabel beanTwoRowOne = new JLabel(cactus); 
	beanTwoRowOne.setBackground(realRed);
	beanTwoRowOne.setOpaque(true);
	rowTwo.add(beanTwoRowOne);


	

	//Loteria Row 2
	ImageIcon hat = new ImageIcon("src/Loteria_Project/LoteriaPDF/sombrero.png");
	JLabel beanOneRowTwo = new JLabel(hat); 
	beanOneRowTwo.setBackground(realRed);
	beanOneRowTwo.setOpaque(true);
	rowThree.add(beanOneRowTwo);
	JButton r2c1 = new JButton(board.get(4).getImage());
	JButton r2c2 = new JButton(board.get(5).getImage());
	JButton r2c3 = new JButton(board.get(5).getImage());
	JButton r2c4 = new JButton(board.get(7).getImage());
	rowThree.add(r2c1); 
	rowThree.add(r2c2); 
	rowThree.add(r2c3); 
	rowThree.add(r2c4); 
	JLabel beanTwoRowTwo = new JLabel(hat); 
	beanTwoRowTwo.setBackground(realRed);
	beanTwoRowTwo.setOpaque(true);
	rowThree.add(beanTwoRowTwo);
	
	//Loteria Row 4 
	JLabel beanOneRowThree = new JLabel();
	beanOneRowThree.setBackground(realRed);
	beanOneRowThree.setOpaque(true);
	rowFour.add(beanOneRowThree);
	JButton r3c1 = new JButton(board.get(8).getImage());
	JButton r3c2 = new JButton(board.get(9).getImage());
	JButton r3c3 = new JButton(board.get(10).getImage());
	JButton r3c4 = new JButton(board.get(11).getImage());
	rowFour.add(r3c1); 
	rowFour.add(r3c2); 
	rowFour.add(r3c3); 
	rowFour.add(r3c4); 
	JLabel beanTwoRowThree = new JLabel();
	beanTwoRowThree.setBackground(realRed);
	beanTwoRowThree.setOpaque(true);
	rowFour.add(beanTwoRowThree);
	
	
	//Loteria Row 4 
	JLabel beanOneRowFour = new JLabel(); 
	beanOneRowFour.setBackground(realRed);
	beanOneRowFour.setOpaque(true);
	rowFive.add(beanOneRowFour);
	JButton r4c1 = new JButton(board.get(12).getImage());
	JButton r4c2 = new JButton(board.get(13).getImage());
	JButton r4c3 = new JButton(board.get(14).getImage());
	JButton r4c4 = new JButton(board.get(15).getImage());
	rowFive.add(r4c1); 
	rowFive.add(r4c2); 
	rowFive.add(r4c3); 
	rowFive.add(r4c4); 
	JLabel beanTwoRowFour = new JLabel(); 
	beanTwoRowFour.setBackground(realRed);
	beanTwoRowFour.setOpaque(true);
	rowFive.add(beanTwoRowFour);
	
	
	
	ImageIcon undertitle = new ImageIcon("src/Loteria_Project/LoteriaPDF/Loteria_UnderTitle.png");
	JLabel bottom = new JLabel(undertitle); 
	rowSix.add(bottom);
	
	
	pack();
	setLocationRelativeTo(null);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);



	

}
	


private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
    Image img = icon.getImage();  
    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
    return new ImageIcon(resizedImage);
}

public static void main(String[] args) {
	Loteria_Game_Beta gui = new Loteria_Game_Beta();
    gui.setVisible(true);
	}






public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
