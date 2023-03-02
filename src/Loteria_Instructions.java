//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//import javax.swing.border.EtchedBorder;
//
//public class Loteria_Instructions extends JPanel implements ActionListener {
//	JLabel instro;
//	JButton playGame;
//	Color realRed = new Color(219, 0, 0);
//
//	public Loteria_Instructions() {
//
//		ImageIcon backdrop = new ImageIcon("LoteriaPDF/instructions.png");
//
//		instro = new JLabel(backdrop);
//
//		instro.setOpaque(true);
//
//		instro.setBounds(0, 0, 850, 550);
//
//		playGame = new JButton();
//		playGame.setBounds(315, 362, 235, 105);
//		playGame.setFont(new Font("Comic Sans", Font.BOLD, 25));
//		playGame.setText("Play Game");
//		playGame.addActionListener(this);
//		playGame.setBackground(realRed);
//
//		instro.setBackground(realRed);
//		add(instro);
//		add(playGame);
//		setLayout(null);
//		setVisible(true);
//
//	}
//
//	public void actionPerformed(ActionEvent e) {
//		if (e.getSource() == playGame) {
//			LoteriaDriver.changeFrame(4);
//		}
//
//	}
//
//}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Loteria_Instructions extends JPanel implements ActionListener {
	private static final Color REAL_RED = new Color(219, 0, 0);
	private JLabel instructionsLabel;
	private JButton playGameButton;

	public Loteria_Instructions() {
		instructionsLabel = new JLabel(new ImageIcon("LoteriaPDF/instructions.png"));
		instructionsLabel.setOpaque(true);
		instructionsLabel.setBackground(REAL_RED);

		playGameButton = new JButton("Play Game");
		playGameButton.setFont(new Font("Comic Sans", Font.BOLD, 25));
		playGameButton.setBounds(315, 362, 235, 105);
		playGameButton.addActionListener(this);
		playGameButton.setBackground(REAL_RED);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		buttonPanel.add(playGameButton);
		buttonPanel.setOpaque(false);

		setLayout(new BorderLayout());
		add(instructionsLabel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		setBackground(REAL_RED);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == playGameButton) {
			LoteriaDriver.changeFrame(4);
		}
	}
}
