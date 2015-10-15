package bj_sim;

public class Game {
	
	private int sessions;
	private int deckNumber;
	private int tableMinimum;
	private int startAmount;
	private int stopAmount;
	private boolean martingale;
	private boolean martingalePlus;
	private boolean flat;
	private boolean paroli;
	
	
	//running the number of simulations or sessions
	public void runSessions(){
		
		System.out.println("Start");
		
		//simulating a new 'night or session' of gambling
		while(sessions > 0){
			playBJ();
			sessions--;
		}
		
		System.out.println("Done");
	}
	
	
	
	private static int playerAces = 0;
	private static int dealerAces = 0;
	
	//playing the actual game of blackjack
	public void playBJ(){
		
		boolean inHand = true;
		int playerCard1 = 0;
		int platerCard2 = 0;
		int dealerCard1 = 0;
		int dealerCard2 = 0;
		int playerValue = 0;
		int dealerValue = 0;
		
		Deck deck = new Deck();
		//creating the deck of cards
		deck.createGameDeck(deckNumber);
		
		//shuffling the cards
		deck.deckShuffle();
		
		//dealPlayerHand();
		//dealDealererHand();
		//deck.printDeck(52);
		
	}
	
	
	//checking for aces
	public static boolean aceCheck(int card){
		 if (card == 1){
			 return true;
		 }
		 else return false;
	}
	
	//getting the player value with new card
	public static int getPlayerValue(int card, int total, int aces){
		
		int value = 0;
		value = total + card;
		
		if (card == 1){
			value = total + 11;
			
			if (value > 21){
				value = total + 1;
				playerAces --;
			}
		}
		
		if (value > 21 && aces > 0){
			value = value - 10;
			playerAces --;
		}
		
		return value;

	}
	
	//SETTERS
	public void setSessions(int s){
		this.sessions = s;
		
	}
	
	public void setDecks(int d){
		this.deckNumber = d;
	}
	
	public void setTableMinimum(int m){
		this.tableMinimum = m;
	}
	
	//setting my boolean betting system variables, martingale, martingale plus etc...
	public void setBettingSystems(boolean m, boolean mp, boolean f, boolean p){
		this.martingale = m;
		this.martingalePlus = mp;
		this.flat = f;
		this.paroli = p;
	}
	
}
