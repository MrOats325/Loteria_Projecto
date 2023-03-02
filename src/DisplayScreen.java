
//
//
//import java.awt.Color;
//import java.awt.GridLayout;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//
///**
// * The title screen.
// * 
// * @author MrOats325
// * @version 2022.05.04
// */
//
//public class DisplayScreen extends JPanel {
//	/** play button 
//	*/
//    private JButton button;
//	private Color realRed = new Color(219, 0, 0);
//
//	
//    public DisplayScreen() {
//        setLayout(new GridLayout(1,1));
//
//        button = new JButton();
//        button.setIcon(new ImageIcon("LoteriaPDF/Loteria_loadingscreen.png"));
//        button.addActionListener(new Listener());
//        button.setBackground(realRed);
//        
//
//        add(button);
//    }
//    
//    /**
//     * Listener for the button, which takes the player to the character select 
//     * screen.
//     * 
//     * @author MrOats325
//     */
//    private class Listener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            LoteriaDriver.changeFrame(2);
//        }
//    }
//}
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * The title screen.
 * 
 * @author MrOats325
 * @version 2022.05.04
 */

public class DisplayScreen extends JPanel {
	/** play button */
	private JButton button;
	private static final Color REAL_RED = new Color(219, 0, 0);

	public DisplayScreen() {
		setLayout(new GridLayout(1, 1));
		button = new JButton();
		button.setIcon(new ImageIcon("LoteriaPDF/Loteria_loadingscreen.png"));

		button.addActionListener(e -> LoteriaDriver.changeFrame(2));
		button.setBackground(REAL_RED);
		add(button);
	}
}