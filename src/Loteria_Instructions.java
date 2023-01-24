

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

public class Loteria_Instructions extends JPanel implements ActionListener {
	JLabel instro;
	JButton playGame;
	Color realRed = new Color(219, 0, 0);

	public Loteria_Instructions() {

		ImageIcon backdrop = new ImageIcon("LoteriaPDF/instructions.png");

		instro = new JLabel(backdrop);

		instro.setOpaque(true);

		instro.setBounds(0, 0, 850, 550);
		
		playGame = new JButton(); 
		playGame.setBounds(315,362,235,105); 
		playGame.setFont(new Font("Comic Sans", Font.BOLD, 25)); 
		playGame.setText("Play Game");
		playGame.addActionListener(this);
		playGame.setBackground(realRed);

		

		instro.setBackground(realRed);
		add(instro);
		add(playGame); 
		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == playGame) {
			LoteriaDriver.changeFrame(4);
		}

	}

}
