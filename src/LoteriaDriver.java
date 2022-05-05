package Loteria_Project.src;

import java.awt.Color;

import javax.swing.JFrame;

public class LoteriaDriver {
	/** Displays Title Screen*/
	private static JFrame displayFrame; 
	
	/** Displays Button Screen*/
	private static JFrame buttonFrame; 
	
	/**Displays The Instructions*/
	private static JFrame instructionsFrame; 
	
	/** Displays The Game*/ 
	private static JFrame gameFrame; 
	
	Color realRed = new Color(219,0,0);
	
    /**
     * Given an int, switches to the corresponding JFrame (1, 2, 3, or 4).
     */
	
	public static void changeFrame(int num) {
		if(num == 1) {
			displayFrame.setVisible(true);
			buttonFrame.setVisible(false);
			instructionsFrame.setVisible(false);
			//gameFrame.setVisible(false);
            
			displayFrame.setLocation(instructionsFrame.getX(), instructionsFrame.getY());
			displayFrame.setSize(instructionsFrame.getWidth(), instructionsFrame.getHeight());
        }
		
		else if(num == 2) {
			displayFrame.setVisible(false); 
			buttonFrame.setVisible(true);
			//instructionsFrame.setVisible(false);
			
			buttonFrame.setLocation(displayFrame.getX(), displayFrame.getY());
			buttonFrame.setSize(displayFrame.getWidth(), displayFrame.getHeight());
        }
        
		else if (num == 3) {
			displayFrame.setVisible(false);
			buttonFrame.setVisible(false);       
			instructionsFrame.setVisible(true);
            
			instructionsFrame.setLocation(buttonFrame.getX(), buttonFrame.getY());
			instructionsFrame.setSize(buttonFrame.getWidth(), buttonFrame.getHeight());            

            // Replace the content in frame3 with a new CrapsPanel.
			instructionsFrame.getContentPane().removeAll();
			//instructionsFrame.getContentPane().add(new CrapsPanel());
			instructionsFrame.revalidate();
			instructionsFrame.repaint();
        }
		
	}
	
	
    /**
     * Set basic properties for each JFrame.
     * 
     * @param jf
     *          a JFrame
     */
    private static void setFrame(JFrame jf) {
        jf.setSize(850, 550);
        jf.setLocationRelativeTo( null );
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
	public static void main(String[] args) {
		displayFrame = new JFrame("Lotreia");
        setFrame(displayFrame);
        displayFrame.setContentPane(new DisplayScreen());
        displayFrame.setVisible(true);
        
        
        buttonFrame = new JFrame("Loteria Main Screen");
        setFrame(buttonFrame); 
        buttonFrame.setContentPane(new Main_Menu_Loteria());
        buttonFrame.setVisible(false);
        
//        frame3 = new JFrame("Super Mario Craps");
//        setFrame(frame3);
//        frame3.setContentPane(new CrapsPanel());
//        frame3.setVisible(false);

	}
	
}
