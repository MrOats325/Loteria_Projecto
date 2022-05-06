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
			gameFrame.setVisible(false);
            
			displayFrame.setLocation(buttonFrame.getX(), buttonFrame.getY());
			displayFrame.setSize(buttonFrame.getWidth(), buttonFrame.getHeight());
        }
		
		else if(num == 2) {
			displayFrame.setVisible(false); 
			buttonFrame.setVisible(true);
			instructionsFrame.setVisible(false);
			gameFrame.setVisible(false);

			
			buttonFrame.setLocation(displayFrame.getX(), displayFrame.getY());
			buttonFrame.setSize(displayFrame.getWidth(), displayFrame.getHeight());
        }
        
		else if (num == 3) {
			displayFrame.setVisible(false);
			buttonFrame.setVisible(false);       
			instructionsFrame.setVisible(true);
			gameFrame.setVisible(false);

            
			instructionsFrame.setLocation(buttonFrame.getX(), buttonFrame.getY());
			instructionsFrame.setSize(buttonFrame.getWidth(), buttonFrame.getHeight());            

        }
		
		else if (num == 4) {
			displayFrame.setVisible(false);
			buttonFrame.setVisible(false);       
			instructionsFrame.setVisible(false);
			gameFrame.setVisible(true);

            
			//gameFrame.setLocation(buttonFrame.getX(), buttonFrame.getY());
			//gameFrame.setSize(buttonFrame.getWidth(), buttonFrame.getHeight());            

            // Replace the content in frame3 with a new LoteriaPanel.
			gameFrame.getContentPane().removeAll();
			//gameFrame.getContentPane().add(new CrapsPanel());
			gameFrame.revalidate();
			gameFrame.repaint();
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
    
    private static void instro_frame(JFrame jf) {
    	jf.setSize(769, 413);
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
        
        
        instructionsFrame = new JFrame("Instruction Screen");
        instro_frame(instructionsFrame); 
        instructionsFrame.setContentPane(new Loteria_Instructions());
        instructionsFrame.setVisible(false);
        
        gameFrame = new JFrame("Loteria Game");
        setFrame(gameFrame); 
        //buttonFrame.setContentPane(new Main_Menu_Loteria());
        gameFrame.setVisible(false);

	}
	
}
