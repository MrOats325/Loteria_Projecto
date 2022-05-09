package Loteria_Project.src;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class Loteria_Game extends JPanel implements ActionListener{
	/** The creates deck of loteria cards to load the board */
    private Loteria_Cards loteria;
    
    /** The creates deck of loteria cards to generate the dealer */
    private Loteria_Cards dealt;
    
    /** The list that will hold the dealers cards */
    private ABList<Loteria> dealer;
    
    /** The list that will hold the board cards */
    private ABList<Loteria> board;
    
    /** Generates the first row buttons for the board */
    private JButton r1c1, r1c2, r1c3, r1c4;
    
    /** Generates the second row buttons for the board */
    private JButton r2c1, r2c2, r2c3, r2c4;
    
    /** Generates the third row buttons for the board */
    private JButton r3c1, r3c2, r3c3, r3c4;
    
    /** Generates the fourth row buttons for the board */
    private JButton r4c1, r4c2, r4c3, r4c4;
    
    private JLabel changer; 
    
    private JButton checker; 
    
    private static final Color GREEN = new Color(200, 255, 200);
    private static final Color BLUE = new Color(200, 200, 255);
	private static Color realRed = new Color(219,0,0);

    
    
    public Loteria_Game() {
    	
    	//Class of loteria cards 
    	loteria = new Loteria_Cards();
		dealt = new Loteria_Cards();

		//Cards of shuffle 
		loteria.shuffle();
		dealt.shuffle();

		//ABLIST 
		board = new ABList();
		dealer = new ABList();
		
		
		
		//ABLIST 
		for (int i = 0; i < 16; i++) {
			board.add(loteria.nextCard());
		}
		
		//The Dealer 
		changer = new JLabel(); 
		dealer.add(dealt.nextCard());
		changer.setIcon(dealer.get(0).getImage());
		System.out.println(dealer.get(0).getRank());
		changer.setBounds(1150, 250, 130, 150);
		add(changer);
		
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
		
		//Start the counter
		t.start();
		
		//BOARD topRow 
		r1c1 = new JButton(board.get(0).getImage());
		r1c2 = new JButton(board.get(1).getImage());
		r1c3 = new JButton(board.get(2).getImage());
		r1c4 = new JButton(board.get(3).getImage());
		
		
		r1c1.setBounds(450, 20, 130, 150);
		r1c2.setBounds(575, 20, 130, 150);
		r1c3.setBounds(700, 20, 130, 150);
		r1c4.setBounds(825, 20, 130, 150);
		
		r1c1.setBackground(realRed);
		r1c2.setBackground(realRed);
		r1c3.setBackground(realRed);
		r1c4.setBackground(realRed);
		
		r1c1.setBorderPainted(false);
		r1c2.setBorderPainted(false);
		r1c3.setBorderPainted(false);
		r1c4.setBorderPainted(false);
	
		add(r1c1);
		add(r1c2);
		add(r1c3);
		add(r1c4);
		
		//BOARD secondRow 
		r2c1 = new JButton(board.get(4).getImage());
		r2c2 = new JButton(board.get(5).getImage());
		r2c3 = new JButton(board.get(6).getImage());
		r2c4 = new JButton(board.get(7).getImage());
		
		
		r2c1.setBounds(450, 190, 130, 150);
		r2c2.setBounds(575, 190, 130, 150);
		r2c3.setBounds(700, 190, 130, 150);
		r2c4.setBounds(825, 190, 130, 150);
		
		r2c1.setBackground(realRed);
		r2c2.setBackground(realRed);
		r2c3.setBackground(realRed);
		r2c4.setBackground(realRed);
		
		r2c1.setBorderPainted(false);
		r2c2.setBorderPainted(false);
		r2c3.setBorderPainted(false);
		r2c4.setBorderPainted(false);
	
		add(r2c1);
		add(r2c2);
		add(r2c3);
		add(r2c4);
		
		//BOARD thirdRow 
		r3c1 = new JButton(board.get(8).getImage());
		r3c2 = new JButton(board.get(9).getImage());
		r3c3 = new JButton(board.get(10).getImage());
		r3c4 = new JButton(board.get(11).getImage());
		
		
		r3c1.setBounds(450, 360, 130, 150);
		r3c2.setBounds(575, 360, 130, 150);
		r3c3.setBounds(700, 360, 130, 150);
		r3c4.setBounds(825, 360, 130, 150);
		
		r3c1.setBackground(realRed);
		r3c2.setBackground(realRed);
		r3c3.setBackground(realRed);
		r3c4.setBackground(realRed);
		
		r3c1.setBorderPainted(false);
		r3c2.setBorderPainted(false);
		r3c3.setBorderPainted(false);
		r3c4.setBorderPainted(false);
	
		add(r3c1);
		add(r3c2);
		add(r3c3);
		add(r3c4);
		
		//BOARD fourthRow 
		r4c1 = new JButton(board.get(12).getImage());
		r4c2 = new JButton(board.get(13).getImage());
		r4c3 = new JButton(board.get(14).getImage());
		r4c4 = new JButton(board.get(15).getImage());
		
		
		r4c1.setBounds(450, 530, 130, 150);
		r4c2.setBounds(575, 530, 130, 150);
		r4c3.setBounds(700, 530, 130, 150);
		r4c4.setBounds(825, 530, 130, 150);
		
		r4c1.setBackground(realRed);
		r4c2.setBackground(realRed);
		r4c3.setBackground(realRed);
		r4c4.setBackground(realRed);
		
		r4c1.setBorderPainted(false);
		r4c2.setBorderPainted(false);
		r4c3.setBorderPainted(false);
		r4c4.setBorderPainted(false);
	
		add(r4c1);
		add(r4c2);
		add(r4c3);
		add(r4c4);
		
		//Button 
		checker = new JButton();
		checker.setBounds(1035, 400, 350, 150);
		add(checker); 
		
		
		setBackground(realRed);
		setLayout(null); 
		setVisible(true);

    }
    
    
    public void actionPerformed(ActionEvent e) {
		
		
	}
    
	private static String format(int i) {
		String result = String.valueOf(i);
		if (result.length() == 1) {
			result = "0" + result;
		}
		return result;
	}

}
