
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class Loteria_Game extends JPanel implements ActionListener {
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

	private Random rand;

	private JLabel to_win;

	private JLabel holder;

	private JLabel board_win;

	private int which_board;

	private static final Color GREEN = new Color(200, 255, 200);
	private static final Color BLUE = new Color(200, 200, 255);
	private static Color realRed = new Color(219, 0, 0);

	ImageIcon digagonal = new ImageIcon("LoteriaPDF/diagonal_board.png");
	ImageIcon four_corner = new ImageIcon("LoteriaPDF/four_corners.png");
	ImageIcon four_in_corner = new ImageIcon("LoteriaPDF/four_in_corner.png");
	ImageIcon full_board = new ImageIcon("LoteriaPDF/full_board.png");
	ImageIcon horizontal = new ImageIcon("LoteriaPDF/horiztonal_board.png");
	ImageIcon vertical_line = new ImageIcon("LoteriaPDF/vertical_line.png");

	public Loteria_Game() {

		// Class of loteria cards
		loteria = new Loteria_Cards();
		dealt = new Loteria_Cards();

		// Cards of shuffle
		loteria.shuffle();
		dealt.shuffle();

		// ABLIST
		board = new ABList();
		dealer = new ABList();

		// ABLIST
		for (int i = 0; i < 16; i++) {
			board.add(loteria.nextCard());
		}

		// The Dealer
		changer = new JLabel();
		dealer.add(dealt.nextCard());
		changer.setIcon(dealer.get(0).getImage());
		changer.setBounds(1150, 250, 130, 150);
		add(changer);

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
				if (time % 1 == 0) {
					dealer.add(dealt.nextCard());
					changer.setIcon(dealer.get(index_of_dealt).getImage());
					index_of_dealt += 1;

				}
			}
		});

		// Start the counter
		t.start();

		// BOARD topRow
		r1c1 = new JButton(board.get(0).getImage());
		r1c2 = new JButton(board.get(1).getImage());
		r1c3 = new JButton(board.get(2).getImage());
		r1c4 = new JButton(board.get(3).getImage());

		r1c1.addActionListener(this);
		r1c2.addActionListener(this);
		r1c3.addActionListener(this);
		r1c4.addActionListener(this);

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

		// BOARD secondRow
		r2c1 = new JButton(board.get(4).getImage());
		r2c2 = new JButton(board.get(5).getImage());
		r2c3 = new JButton(board.get(6).getImage());
		r2c4 = new JButton(board.get(7).getImage());

		r2c1.addActionListener(this);
		r2c2.addActionListener(this);
		r2c3.addActionListener(this);
		r2c4.addActionListener(this);

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

		// BOARD thirdRow
		r3c1 = new JButton(board.get(8).getImage());
		r3c2 = new JButton(board.get(9).getImage());
		r3c3 = new JButton(board.get(10).getImage());
		r3c4 = new JButton(board.get(11).getImage());

		r3c1.addActionListener(this);
		r3c2.addActionListener(this);
		r3c3.addActionListener(this);
		r3c4.addActionListener(this);

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

		// BOARD fourthRow
		r4c1 = new JButton(board.get(12).getImage());
		r4c2 = new JButton(board.get(13).getImage());
		r4c3 = new JButton(board.get(14).getImage());
		r4c4 = new JButton(board.get(15).getImage());

		r4c1.addActionListener(this);
		r4c2.addActionListener(this);
		r4c3.addActionListener(this);
		r4c4.addActionListener(this);

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

		// Button
		checker = new JButton();
		checker.setBounds(1035, 400, 350, 150);
		checker.addActionListener(this);
		checker.setFont(new Font("Comic Sans", Font.BOLD, 55));
		checker.setBackground(realRed);
		checker.setText("Loteria");
		checker.setForeground(Color.BLACK);
		add(checker);

		// Deciding how to win
		rand = new Random();
		which_board = rand.nextInt(5);

		holder = new JLabel();
		to_win = new JLabel();
		board_win = new JLabel();

		// Setting To win Label
		to_win.setBounds(100, 100, 150, 150);
		to_win.setFont(new Font("Serif", Font.BOLD, 35));
		to_win.setText("TO WIN");
		to_win.setBackground(realRed);
		to_win.setForeground(Color.BLACK);
		add(to_win);

		// Setting the board to win
		holder.setBounds(70, 250, 200, 270);
		add(holder);

		howTo(which_board);
		setBackground(realRed);
		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == r1c1) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(0).getRank().equals(dealer.get(i).getRank())) {
					r1c1.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r1c2) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(1).getRank().equals(dealer.get(i).getRank())) {
					r1c2.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r1c3) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(2).getRank().equals(dealer.get(i).getRank())) {
					r1c3.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r1c4) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(3).getRank().equals(dealer.get(i).getRank())) {
					r1c4.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r2c1) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(4).getRank().equals(dealer.get(i).getRank())) {
					r2c1.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r2c2) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(5).getRank().equals(dealer.get(i).getRank())) {
					r2c2.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r2c3) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(6).getRank().equals(dealer.get(i).getRank())) {
					r2c3.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r2c4) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(7).getRank().equals(dealer.get(i).getRank())) {
					r2c4.setEnabled(false);
				}
			}
		}

		if (e.getSource() == r3c1) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(8).getRank().equals(dealer.get(i).getRank())) {
					r3c1.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r3c2) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(9).getRank().equals(dealer.get(i).getRank())) {
					r3c2.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r3c3) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(10).getRank().equals(dealer.get(i).getRank())) {
					r3c3.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r3c4) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(11).getRank().equals(dealer.get(i).getRank())) {
					r3c4.setEnabled(false);
				}
			}
		}
		//
		if (e.getSource() == r4c1) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(12).getRank().equals(dealer.get(i).getRank())) {
					r4c1.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r4c2) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(13).getRank().equals(dealer.get(i).getRank())) {
					r4c2.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r4c3) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(14).getRank().equals(dealer.get(i).getRank())) {
					r4c3.setEnabled(false);
				}
			}
		}
		if (e.getSource() == r4c4) {
			for (int i = 0; i < dealer.size(); i++) {
				if (board.get(15).getRank().equals(dealer.get(i).getRank())) {
					r4c4.setEnabled(false);
				}
			}
		}

		// Loteria Button
		if (e.getSource() == checker) {

			if (which_board == 0) {
				// board_win.setText("4 Corners");
				// System.out.println(which_board);
				if (!r1c1.isEnabled() && !r1c2.isEnabled() && !r2c1.isEnabled() && !r2c2.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
			}
			if (which_board == 1) {
				// board_win.setText("Full");
				// System.out.println(which_board);
				if (!r1c1.isEnabled() && !r1c2.isEnabled() && !r1c3.isEnabled() && !r1c4.isEnabled()
						&& !r2c1.isEnabled() && !r2c2.isEnabled() && !r2c3.isEnabled() && !r2c4.isEnabled()
						&& !r3c1.isEnabled() && !r3c2.isEnabled() && !r3c3.isEnabled() && !r3c4.isEnabled()
						&& !r4c1.isEnabled() && !r4c2.isEnabled() && !r4c3.isEnabled() && !r4c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);

				}
			}
			if (which_board == 2) {
				// board_win.setText("Vertical Line");
				// System.out.println(which_board);
//					System.out.println(which_board);
				if (!r1c1.isEnabled() && !r2c1.isEnabled() && !r3c1.isEnabled() && !r4c1.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r1c2.isEnabled() && !r2c2.isEnabled() && !r3c2.isEnabled() && !r4c2.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r1c3.isEnabled() && !r2c3.isEnabled() && !r3c3.isEnabled() && !r4c3.isEnabled()) {
					LoteriaDriver.changeFrame(5);

				}
				if (!r1c4.isEnabled() && !r2c4.isEnabled() && !r3c4.isEnabled() && !r4c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
			}
			if (which_board == 3) {
				// board_win.setText("Horizontal Line");
				// System.out.println(which_board);
				if (!r2c1.isEnabled() && !r2c2.isEnabled() && !r2c3.isEnabled() && !r2c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r1c1.isEnabled() && !r1c2.isEnabled() && !r1c3.isEnabled() && !r1c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r3c1.isEnabled() && !r3c2.isEnabled() && !r3c3.isEnabled() && !r3c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r4c1.isEnabled() && !r4c2.isEnabled() && !r4c3.isEnabled() && !r4c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
			}
			if (which_board == 4) {
				// board_win.setText("Diagonal");
				// System.out.println(which_board);
				if (!r1c4.isEnabled() && !r2c3.isEnabled() && !r3c2.isEnabled() && !r4c1.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r1c1.isEnabled() && !r2c2.isEnabled() && !r3c3.isEnabled() && !r4c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
			}
			if (which_board == 5) {
				// board_win.setText("4 In Any Corner");
				// System.out.println(which_board);
				if (!r1c1.isEnabled() && !r1c2.isEnabled() && !r2c1.isEnabled() && !r2c2.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r1c3.isEnabled() && !r1c4.isEnabled() && !r2c3.isEnabled() && !r2c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r3c1.isEnabled() && !r3c2.isEnabled() && !r4c1.isEnabled() && !r4c2.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
				if (!r3c3.isEnabled() && !r3c4.isEnabled() && !r4c3.isEnabled() && !r4c4.isEnabled()) {
					LoteriaDriver.changeFrame(5);
				}
			}

		}
	}

	public void howTo(int i) {
		if (i == 0) {
			holder.setIcon(four_corner);
		}
		if (i == 1) {
			holder.setIcon(full_board);
		}
		if (i == 2) {
			holder.setIcon(vertical_line);
		}
		if (i == 3) {
			holder.setIcon(horizontal);
		}
		if (i == 4) {
			holder.setIcon(digagonal);
		}
		if (i == 5) {
			holder.setIcon(four_in_corner);
		}

	}

	private static String format(int i) {
		String result = String.valueOf(i);
		if (result.length() == 1) {
			result = "0" + result;
		}
		return result;
	}

}
