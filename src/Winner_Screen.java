import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class Winner_Screen extends JPanel {
	private static final Color REAL_RED = new Color(219, 0, 0);
	private static final Font BUTTON_FONT = new Font("Comic Sans", Font.BOLD, 25);
	private static final Border BUTTON_BORDER = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	
	public Winner_Screen() {
		setBackground(REAL_RED);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(600, 600));
        
        JButton playGameAgain = createButton("Play Game Again", e -> LoteriaDriver.changeFrame(4));
        JButton quit = createButton("Quit", e -> System.exit(98));
        
        add(Box.createVerticalGlue());
        add(playGameAgain);
        add(quit);
        add(Box.createVerticalGlue());
	}
	private JButton createButton(String text, ActionListener listener) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setFont(BUTTON_FONT);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setBorder(BUTTON_BORDER);
        button.setBackground(REAL_RED);
        button.setForeground(Color.WHITE);
        button.addActionListener(listener);
        button.setPreferredSize(new Dimension(300, 100));
        return button;
    }
}
