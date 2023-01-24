

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class Loteria_Game_Beta extends JFrame implements ActionListener {
	
	Loteria_Cards loteria, dealt;
	ABList<Loteria> dealer, board;
	JLabel changer;
	JButton r1c1, r1c2, r1c3, r1c4, r2c1, r2c2, r2c3, r2c4, r3c1, r3c2, r3c3, r3c4, r4c1, r4c2, r4c3, r4c4;

	public Loteria_Game_Beta() {
		setTitle("Loteria");
		setLayout(new GridLayout(6, 1));
		setPreferredSize(new Dimension(774, 900));
		Color realRed = new Color(219, 0, 0);

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

		loteria = new Loteria_Cards();
		dealt = new Loteria_Cards();

		loteria.shuffle();
		dealt.shuffle();

		board = new ABList();
		dealer = new ABList();

		for (int i = 0; i < 16; i++) {
			board.add(loteria.nextCard());
		}

		rowOne.setBackground(realRed);
		rowOne.setOpaque(true);

		changer = new JLabel();
		//JLabel blank = new JLabel();

		dealer.add(dealt.nextCard());
		changer.setIcon(dealer.get(0).getImage());
		System.out.println(dealer.get(0).getRank());

		final JFrame frm = new JFrame("Countdown");
		final JLabel countdownLabel = new JLabel("00:00");
		final Timer t = new Timer(1000, new ActionListener() {
			int time = 0;
			int index_of_dealt = 1;

			public void actionPerformed(ActionEvent e) {
				time++;
				countdownLabel.setText(format(time / 60) + ":" + format(time % 60));
				if (time == 0) {
					final Timer timer = (Timer) e.getSource();
					timer.stop();
				}
				if (time % 5 == 0) {
					//System.out.println(index_of_dealt);
					dealer.add(dealt.nextCard());
					changer.setIcon(dealer.get(index_of_dealt).getImage());
					System.out.println(dealer.get(index_of_dealt).getRank());
					index_of_dealt += 1;

				}
			}
		});

		rowOne.add(changer);
		rowOne.add(countdownLabel);
		t.start();
		//rowOne.add(blank);

		// JButton r1c1 = new JButton(board.get(0).getImage());
		// Loteria Row 1
		ImageIcon cactus = new ImageIcon("src/Loteria_Project/LoteriaPDF/sombrero.png");
		JLabel beanOneRowOne = new JLabel(cactus);
		beanOneRowOne.setBackground(realRed);
		beanOneRowOne.setOpaque(true);
		rowTwo.add(beanOneRowOne);
		r1c1 = new JButton(board.get(0).getImage());
		r1c2 = new JButton(board.get(1).getImage());
		r1c3 = new JButton(board.get(2).getImage());
		r1c4 = new JButton(board.get(3).getImage());
		r1c1.addActionListener(this);
		r1c2.addActionListener(this);
		r1c3.addActionListener(this);
		r1c4.addActionListener(this);

		r1c1.setBackground(realRed);
		r1c2.setBackground(realRed);
		r1c3.setBackground(realRed);
		r1c4.setBackground(realRed);
		r1c1.setBorderPainted(false);
		r1c2.setBorderPainted(false);
		r1c3.setBorderPainted(false);
		r1c4.setBorderPainted(false);
		rowTwo.add(r1c1);
		rowTwo.add(r1c2);
		rowTwo.add(r1c3);
		rowTwo.add(r1c4);
		JLabel beanTwoRowOne = new JLabel(cactus);
		beanTwoRowOne.setBackground(realRed);
		beanTwoRowOne.setOpaque(true);
		rowTwo.add(beanTwoRowOne);

		// Loteria Row 2
		ImageIcon hat = new ImageIcon("src/Loteria_Project/LoteriaPDF/sombrero.png");
		JLabel beanOneRowTwo = new JLabel(hat);
		beanOneRowTwo.setBackground(realRed);
		beanOneRowTwo.setOpaque(true);
		rowThree.add(beanOneRowTwo);
		r2c1 = new JButton(board.get(4).getImage());
		r2c2 = new JButton(board.get(5).getImage());
		r2c3 = new JButton(board.get(6).getImage());
		r2c4 = new JButton(board.get(7).getImage());
		r2c1.addActionListener(this);
		r2c2.addActionListener(this);
		r2c3.addActionListener(this);
		r2c4.addActionListener(this);
		
		r2c1.setBackground(realRed);
		r2c2.setBackground(realRed);
		r2c3.setBackground(realRed);
		r2c4.setBackground(realRed);
		r2c1.setBorderPainted(false);
		r2c2.setBorderPainted(false);
		r2c3.setBorderPainted(false);
		r2c4.setBorderPainted(false);
		rowThree.add(r2c1);
		rowThree.add(r2c2);
		rowThree.add(r2c3);
		rowThree.add(r2c4);
		JLabel beanTwoRowTwo = new JLabel(hat);
		beanTwoRowTwo.setBackground(realRed);
		beanTwoRowTwo.setOpaque(true);
		rowThree.add(beanTwoRowTwo);

		// Loteria Row 4
		JLabel beanOneRowThree = new JLabel();
		beanOneRowThree.setBackground(realRed);
		beanOneRowThree.setOpaque(true);
		rowFour.add(beanOneRowThree);
		r3c1 = new JButton(board.get(8).getImage());
		r3c2 = new JButton(board.get(9).getImage());
		r3c3 = new JButton(board.get(10).getImage());
		r3c4 = new JButton(board.get(11).getImage());
		r3c1.addActionListener(this);
		r3c2.addActionListener(this);
		r3c3.addActionListener(this);
		r3c4.addActionListener(this);
		
		r3c1.setBackground(realRed);
		r3c2.setBackground(realRed);
		r3c3.setBackground(realRed);
		r3c4.setBackground(realRed);
		r3c1.setBorderPainted(false);
		r3c2.setBorderPainted(false);
		r3c3.setBorderPainted(false);
		r3c4.setBorderPainted(false);
		rowFour.add(r3c1);
		rowFour.add(r3c2);
		rowFour.add(r3c3);
		rowFour.add(r3c4);
		JLabel beanTwoRowThree = new JLabel();
		beanTwoRowThree.setBackground(realRed);
		beanTwoRowThree.setOpaque(true);
		rowFour.add(beanTwoRowThree);

		// Loteria Row 4
		JLabel beanOneRowFour = new JLabel();
		beanOneRowFour.setBackground(realRed);
		beanOneRowFour.setOpaque(true);
		rowFive.add(beanOneRowFour);
		r4c1 = new JButton(board.get(12).getImage());
		r4c2 = new JButton(board.get(13).getImage());
		r4c3 = new JButton(board.get(14).getImage());
		r4c4 = new JButton(board.get(15).getImage());
		r4c1.addActionListener(this);
		r4c2.addActionListener(this);
		r4c3.addActionListener(this);
		r4c4.addActionListener(this);
		
		r4c1.setBackground(realRed);
		r4c2.setBackground(realRed);
		r4c3.setBackground(realRed);
		r4c4.setBackground(realRed);
		r4c1.setBorderPainted(false);
		r4c2.setBorderPainted(false);
		r4c3.setBorderPainted(false);
		r4c4.setBorderPainted(false);
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

	private static String format(int i) {
		String result = String.valueOf(i);
		if (result.length() == 1) {
			result = "0" + result;
		}
		return result;
	}

	public static void main(String[] args) {
		Loteria_Game_Beta gui = new Loteria_Game_Beta();
		gui.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == r1c1) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(0).getRank().equals(dealer.get(i).getRank())) {
					r1c1.setEnabled(false);
					System.out.println("r1c1 was pressed"); 
				}
			}
		}
		if (e.getSource() == r1c2) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(1).getRank().equals(dealer.get(i).getRank())) {
					r1c2.setEnabled(false);
					System.out.println("r1c2 was pressed"); 
				}
			}
		}
		if (e.getSource() == r1c3) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(2).getRank().equals(dealer.get(i).getRank())) {
					r1c3.setEnabled(false);
					System.out.println("r1c3 was pressed"); 
				}
			}
		}
		if (e.getSource() == r1c4) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(3).getRank().equals(dealer.get(i).getRank())) {
					r1c4.setEnabled(false);
					System.out.println("r1c4 was pressed"); 
				}
			}
		}
		if (e.getSource() == r2c1) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(4).getRank().equals(dealer.get(i).getRank())) {
					r2c1.setEnabled(false);
					System.out.println("r2c1 was pressed"); 
				}
			}
		}
		if (e.getSource() == r2c2) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(5).getRank().equals(dealer.get(i).getRank())) {
					r2c2.setEnabled(false);
					System.out.println("r2c2 was pressed"); 
				}
			}
		}
		if (e.getSource() == r2c3) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(6).getRank().equals(dealer.get(i).getRank())) {
					r2c3.setEnabled(false);
					System.out.println("r2c3 was pressed"); 
				}
			}
		}
		if (e.getSource() == r2c4) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(7).getRank().equals(dealer.get(i).getRank())) {
					r2c4.setEnabled(false);
					System.out.println("r2c4 was pressed"); 
				}
			}
		}
		//
		if (e.getSource() == r3c1) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(8).getRank().equals(dealer.get(i).getRank())) {
					r3c1.setEnabled(false);
					System.out.println("r3c1 was pressed"); 
				}
			}
		}
		if (e.getSource() == r3c2) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(9).getRank().equals(dealer.get(i).getRank())) {
					r3c2.setEnabled(false);
					System.out.println("r3c2 was pressed"); 
				}
			}
		}
		if (e.getSource() == r3c3) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(10).getRank().equals(dealer.get(i).getRank())) {
					r3c3.setEnabled(false);
					System.out.println("r3c3 was pressed"); 
				}
			}
		}
		if (e.getSource() == r3c4) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(11).getRank().equals(dealer.get(i).getRank())) {
					r3c4.setEnabled(false);
					System.out.println("r3c4 was pressed"); 
				}
			}
		}
		//
		if (e.getSource() == r4c1) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(12).getRank().equals(dealer.get(i).getRank())) {
					r4c1.setEnabled(false);
					System.out.println("r4c1 was pressed"); 
					
				}
			}
		}
		if (e.getSource() == r4c2) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(13).getRank().equals(dealer.get(i).getRank())) {
					r4c2.setEnabled(false);
					System.out.println("r4c2 was pressed"); 
					
				}
			}
		}
		if (e.getSource() == r4c3) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(14).getRank().equals(dealer.get(i).getRank())) {
					r4c3.setEnabled(false);
					System.out.println("r4c3 was pressed"); 
					
				}
			}
		}
		if (e.getSource() == r4c4) {
			for(int i = 0; i < dealer.size(); i++) {
				if(board.get(15).getRank().equals(dealer.get(i).getRank())) {
					r4c4.setEnabled(false);
					System.out.println("r4c4 was pressed"); 
					
				}
			}
		}
	
		//Wining The Game 
	
		//4 Corners 
		if(!r1c1.isEnabled() && !r1c4.isEnabled() && !r4c1.isEnabled() && !r4c4.isEnabled()) {
			System.out.println("You've won 4 Corners"); 
		}
		
		//Vertical Line  
		if(!r1c2.isEnabled() && !r2c2.isEnabled() && !r3c2.isEnabled() && !r4c2.isEnabled()) {
			System.out.println("You've won Vertical Line"); 
		}
		
		//Horizontal Line 
		if(!r2c1.isEnabled() && !r2c2.isEnabled() && !r2c3.isEnabled() && !r2c4.isEnabled()) {
			System.out.println("You've won Horizontal Line"); 
		}
		
		//Diagonal 
		if(!r1c4.isEnabled() && !r2c3.isEnabled() && !r3c2.isEnabled() && !r4c1.isEnabled()) {
			System.out.println("You've won Diagonal"); 
		}
		
		//4 in Corner
		if(!r1c1.isEnabled() && !r1c2.isEnabled() && !r2c1.isEnabled() && !r2c2.isEnabled()) {
			System.out.println("You've won 4 Corners"); 
		}
		
		
		
		
		
	
	
	

	}

}
