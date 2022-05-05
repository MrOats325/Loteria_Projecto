package Loteria_Project.src;

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
	/** play button 
	*/
    private JButton button;
    
    public DisplayScreen() {
        setLayout(new GridLayout(1,1));

        button = new JButton();
        button.setIcon(new ImageIcon("src/Loteria_Project/LoteriaPDF/background_drop.jpg"));
        button.addActionListener(new Listener());

        add(button);
    }
    
    /**
     * Listener for the button, which takes the player to the character select 
     * screen.
     * 
     * @author MrOats325
     */
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LoteriaDriver.changeFrame(2);
        	//System.out.println("Going to button screen");
        }
    }
}
