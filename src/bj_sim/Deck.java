package bj_sim;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Integer> gameDeck = new ArrayList<Integer>();
	private int numCards;
	private int cardsUsed;
	private boolean shuffleLater;
	
	
	public void createGameDeck(int deckNumber){
		
		//adding the ten values to the deck
		for (int i = 0; i < (deckNumber * 16); i++){
			this.gameDeck.add(10);
		}
		
		//adding non ten values to the deck
		for (int i = 0; i < (deckNumber * 4); i++){
			
			//adding values 1-9, aces being 1
			for (int j = 1; j <= 9; j++){
				this.gameDeck.add(j);
			}
		}
		
		this.numCards = deckNumber * 52;
		this.cardsUsed = 1;
		
		
	}//end createGameDeck
	
	
    public int dealCard(boolean in_hand){
    	
    	//simulates the cut card at 75% penetration
    	if (cardsUsed == ((double)numCards * .75) && in_hand == true) {
    		shuffleLater = true;
    	}
    	
    	if (cardsUsed == ((double)numCards * .75) && in_hand == false){
    		this.deckShuffle();
    	}
    	
    	this.cardsUsed++;
    	return this.gameDeck.get(cardsUsed - 1);
    	
    }//end dealCard
	
    
    public void deckShuffle(){
    	
    	//shuffle deck 3 times
        for (int i = 0; i < 3; i++){
        	Collections.shuffle(gameDeck);
        }
        
        //this has a value of 1 to simulate the cut card
        cardsUsed = 1;

    }//end deckShuffle
    
    
    public void shuffleCheck(){
    	
    	if (this.shuffleLater == true){
    		this.deckShuffle();
    		this.shuffleLater = false;
    	}
    }//end shuffleCheck
    
    
    //my debug, prints deck
    public void printDeck(int numToPrint){
    	
    	/*
    	 * 		1 deck  = 52
    	 * 		2 decks = 104
    	 * 		4 decks = 208
    	 * 		6 decks = 312
    	 * 		8 decks = 416
    	 */

    	System.out.println("----------------------------------------");
    	// print the top cards
    	int counter = 0;
    	for (int c = 0; c < numToPrint; c++) {
    		System.out.println(this.gameDeck.get(c) + "\t@index " + c);
    		counter++;
    	}
    	System.out.println("\n" + counter + " cards displayed\n");
    	
    }//end printDeck 
	
}