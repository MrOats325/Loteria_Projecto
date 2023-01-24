
import java.util.Random;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class Loteria_Cards {
	public static final int NUMCARDS = 54;

	protected ABList<Loteria> deck;
	protected Iterator<Loteria> deal1;

	public Loteria_Cards() {
		deck = new ABList<Loteria>(NUMCARDS);
		ImageIcon image;
		for (Loteria.Rank rank : Loteria.Rank.values()) {
			image = new ImageIcon("Loteria_Cards_png/Loteria" + "_" + rank + ".PNG");
			deck.add(new Loteria(rank, image));
		}
		deal1 = deck.iterator();

	}

	public void shuffle() {
		// Randomizes the order of the cards in the deck.
		// Resets the current deal.

		Random rand = new Random(); // to generate random numbers
		int randLoc; // random location in card deck
		Loteria temp; // for swap of cards

		for (int i = (NUMCARDS - 2); i > 0; i--) {
			randLoc = rand.nextInt(i);
			temp = deck.get(randLoc);
			deck.set(randLoc, deck.get(i));
			deck.set(i, temp);
		}

		deal1 = deck.iterator();
	}

	public boolean hasNextCard() {
		// Returns true if there are still cards left to be dealt;
		// otherwise, returns false.

		return (deal1.hasNext());
	}

	public Loteria nextCard() {
		// Precondition: this.hasNextCard() == true
		//
		// Returns the next card for the current 'deal'.

		return deal1.next();
	}

}