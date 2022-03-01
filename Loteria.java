package Loteria_Project; 

import javax.swing.ImageIcon;


public class Loteria implements Comparable<Loteria> {
	public enum Rank {
		One, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Eleven, Twelve, Thirteen, Fourteen, Fifthteen, Sixteeen, Seventeen, Eightteen, 
		Nineteen, Twenty, Twentyone, Twentytwo, Twentythree, Twentyfour, Twentyfive, Twetysix, Twetyseven, Twetnyeight, Twetnynine, Thirdy,  
		Thirtyone, Thirtytwo, Thirtythree, Thirtyfour, Thirtyfive, Thirtysix, Thirtyseven, Thirtyeight, Thirtynine, Fourty, Fourtyone, Fourtytwo, 
		Fourtythree, Fourtyfive, Fourtysix, Fourtyseven, Fourtyeight, Fourtynine, Fifty, Fiftyone, Fiftytwo, Fiftythree, Fiftyfour
	}


	protected final Rank rank;
	protected ImageIcon image;

	Loteria(Rank rank, ImageIcon image) {
		this.rank = rank;
		this.image = image;
	}

	public Rank getRank() {
		return rank;
	}

	public ImageIcon getImage() {
		return image;
	}

	@Override
	public boolean equals(Object obj)
	// Returns true if 'obj' is a Card with same rank
	// as this Card, otherwise returns false.
	{
		if (obj == this)
			return true;
		else if (obj == null || obj.getClass() != this.getClass())
			return false;
		else {
			Loteria c = (Loteria) obj;
			return (this.rank == c.rank);
		}
	}

	public int compareTo(Loteria other){
		// Compares this Card with 'other' for order. Returns a
		// negative integer, zero, or a positive integer as this object
		// is less than, equal to, or greater than 'other'.
		return this.rank.compareTo(other.rank);
	}

	@Override
	public String toString() {
		return   rank + " "; 
	}
	
}
