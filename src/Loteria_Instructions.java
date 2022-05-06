package Loteria_Project.src;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Loteria_Instructions extends JPanel implements ActionListener {
	JLabel instro;
	JButton butto; 
	
	
	public Loteria_Instructions() {
				
		ImageIcon backdrop = new ImageIcon("src/Loteria_Project/LoteriaPDF/instructions.png");
		instro = new JLabel(backdrop);
		
		instro.setOpaque(true);
		
		instro.setBounds(769, 413, 385, 207);

		
		add(instro);
		setLayout(null);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
