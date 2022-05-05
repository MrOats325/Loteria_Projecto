package Loteria_Project.src;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


public class Loteria_Game extends JPanel {
	/** The creates deck of loteria cards to load the board */
    private Loteria_Cards loteria;
    
    /** The creates deck of loteria cards to generate the dealer */
    private Loteria_Cards generator;
    
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
    


}
